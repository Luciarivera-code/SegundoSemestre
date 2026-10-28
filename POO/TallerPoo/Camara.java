public class Camara extends Producto {

    private String Marca;
    private String Modelo;
    private double Precio;

    public Camara(double Precio, int Numero, int Cantidad, String Nombre, String Marca, String Modelo, double Precio1) {
        super(Precio, Numero, Cantidad, Nombre);
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio1;
    }

    public void Marca() {
        System.out.println("Marca Canon...");
    }

    public void Modelo() {
        System.out.println("Modelo camara Reflex...");
    }

    public void Precio() {
        System.out.println("Precio camara $1'800.000...");
    }

    @Override
    public String toString() {
        return "Camara [Marca=" + Marca + " Modelo=" + Modelo + " Precio=" + Precio + "]";
    }
}