public class Transaccion extends Pago {
    
    private String referencia;

    public Transaccion(String formaPago, String referencia) {
        super(formaPago);
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Transaccion [referencia=" + referencia + "]";
    }
    
}
