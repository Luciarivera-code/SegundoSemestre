public class BotonAscensor extends Boton {

    private int numeroPiso;   // Piso actual
    private int pisoDestino;

    public BotonAscensor(boolean presionado, boolean iluminado, int numeroPiso, int pisoDestino) {
        super(presionado, iluminado);
        this.numeroPiso = numeroPiso;
        this.pisoDestino = pisoDestino;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    @Override
    public void presionarBoton() {
        presionado = true;
        iluminarBoton();
        if (numeroPiso < pisoDestino) {
            System.out.println("Ascensor subiendo.....");
        } else if (numeroPiso > pisoDestino) {
            System.out.println("Ascensor bajando.....");
        } else {
            System.out.println("Estás en el mismo piso");
        }
    }

    public String toString() {
        return "BotonAscensor [ presionado: " + presionado + " iluminado: " + iluminado
                + " Piso Actual: " + numeroPiso + " Piso Destino: " + pisoDestino + " ]";
    }
}