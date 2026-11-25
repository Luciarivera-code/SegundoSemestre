public abstract class Boton {

    protected boolean presionado;
    protected boolean iluminado;

    public Boton(boolean presionado, boolean iluminado) {
        this.presionado = presionado;
        this.iluminado = iluminado;
    }

    public boolean isPresionado() {
        return presionado;
    }

    public boolean isIluminado() {
        return iluminado;
    }

    // Método común: todos los botones se iluminan igual
    public void iluminarBoton() {
        iluminado = true;
        System.out.println("Botón iluminado y sonido suave (solicitud recibida)");
    }

    public void apagarBoton() {
        presionado = false;
        iluminado = false;
    }

    // Método abstracto: cada hijo lo implementa a su manera
    public abstract void presionarBoton();

    public String toString() {
        return "Boton [ presionado: " + presionado + " iluminado: " + iluminado + " ]";
    }
}