import java.util.*;

public class Pedido {

    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;
    private Pago pago;

    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito, Pago pago) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.pago = pago;
    }

    public void Entrega() {
        System.out.println("Pedido ya fue entregado con exito...");
    }

    public void Cancelar() {
        System.out.println("Pedido cancelado...");
    }
    public void Pago(){
        System.out.println("Pago realizado...");
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", producto=" + Arrays.toString(producto) + ", fecha=" + fecha
                + ", numeroTarjetaCredito=" + numeroTarjetaCredito + ", pago=" + pago + "]";
    }

    
}