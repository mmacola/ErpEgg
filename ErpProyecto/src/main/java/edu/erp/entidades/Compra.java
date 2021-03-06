package edu.erp.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Compra {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private Factura factura;
    private Producto producto;
    private Pedidos pedidos;
    private int PrecioAprox;
    private Date FechaAutomatica;

    @OneToOne
    private Pago pago;

    @OneToOne
    private Compra compra;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    public int getPrecioAprox() {
        return PrecioAprox;
    }

    public void setPrecioAprox(int PrecioAprox) {
        this.PrecioAprox = PrecioAprox;
    }

    public Date getFechaAutomatica() {
        return FechaAutomatica;
    }

    public void setFechaAutomatica(Date FechaAutomatica) {
        this.FechaAutomatica = FechaAutomatica;
    }

}
