public class BotonPiso extends Boton {

    private int numeroPiso;
    private String direccion;   // "SUBIDA" o "BAJADA"

    public BotonPiso(boolean presionado, boolean iluminado, int numeroPiso, String direccion) {
        super(presionado, iluminado);
        this.numeroPiso = numeroPiso;
        this.direccion = direccion;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public void presionarBoton() {
        presionado = true;
        iluminarBoton();
        System.out.println("Piso " + numeroPiso + " solicita el ascensor en dirección de " + direccion);
    }

    public String toString() {
        return "BotonPiso [ presionado: " + presionado + " iluminado: " + iluminado
                + " Piso: " + numeroPiso + " Dirección: " + direccion + " ]";
    }
}