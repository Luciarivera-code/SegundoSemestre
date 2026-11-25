public class PuertaPiso extends Puerta {

    private int numeroPiso;

    public PuertaPiso(boolean abierta, boolean obstaculo, int numeroPiso) {
        super(abierta, obstaculo);
        this.numeroPiso = numeroPiso;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    @Override
    public String getTipo() {
        return "Puerta del piso " + numeroPiso;
    }
}