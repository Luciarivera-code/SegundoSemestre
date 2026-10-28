public class Efectivo extends Pago {
    
    private double valor;

    public Efectivo(String formaPago, double valor) {
        super(formaPago);
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Efectivo [valor=" + valor + "]";
    }
    
}
