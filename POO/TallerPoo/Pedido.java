public class Pedido {

    private Cliente Cliente;
    private Producto[] Producto;
    private Date Fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente Cliente, Producto[] Producto, Date Fecha, int numeroTarjetaCredito) {
        this.Cliente = Cliente;
        this.Producto = Producto;
        this.Fecha = Fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void Entrega() {
        System.out.println("Pedido ya fue entregado con exito...");
    }

    public void Cancelar() {
        System.out.println("Pedido cancelado...");
    }

    @Override
    public String toString() {
        return "Pedido [Cliente=" + Cliente + " Fecha=" + Fecha + " numeroTarjetaCredito=" + numeroTarjetaCredito + "]";
    }
}