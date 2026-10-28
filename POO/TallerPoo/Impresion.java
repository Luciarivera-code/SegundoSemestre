public class Impresion extends Producto{

    private String Color;
    private String Tamano;
    private Foto[] Foto;

    public Impresion(double precio, int Numero, int Cantidad, String Nombre, String Color, String Tamano, Foto[] Foto) {
        super(precio, Numero, Cantidad, Nombre);
        this.Color = Color;
        this.Tamano = Tamano;
        this.Foto = Foto;
    }

    public void Color() {
        System.out.println("Blanco y negro...");
    }

    public void Tamano() {
        System.out.println("Tamaño medio...");
    }

    public void Foto() {
        System.out.println("Foto obtenida...");
    }

    @Override
    public String toString() {
        return "Impresion[Color=" + Color + " Tamano=" + Tamano + "Fotos=" + Foto.length + "]";
    }
}