public class PuertaAscensor extends Puerta {

    public PuertaAscensor(boolean abierta, boolean obstaculo) {
        super(abierta, obstaculo);
    }

    @Override
    public String getTipo() {
        return "Puerta del ascensor";
    }
}