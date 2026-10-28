public class TarjetaCredito extends Pago {
    
    private String numeroTarjeta;

    public TarjetaCredito(String formaPago, String numeroTarjeta) {
        super(formaPago);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String toString() {
        return "TarjetaCredito [numeroTarjeta=" + numeroTarjeta + "]";
    }

}
