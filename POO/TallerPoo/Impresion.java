public class Impresion {

    private String Color;
    private String Tamaño;
    private Foto[] Foto;

    public Impresion(String Color, String Tamaño, Foto[] Foto) {
        this.Color = Color;
        this.Tamaño = Tamaño;
        this.Foto = Foto;
    }

    public void Color() {
        System.out.println("Blanco y negro...");
    }

    public void Tamaño() {
        System.out.println("Tamaño medio...");
    }

    public void Foto() {
        System.out.println("Foto obtenida...");
    }

    @Override
    public String toString() {
        return "Impresion[Color=" + Color + " Tamaño=" + Tamaño + "Foto=" + Foto + "]";
    }
}