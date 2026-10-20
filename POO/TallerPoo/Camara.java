public class Camara {

    private String Marca;
    private String Modelo;
    private double Precio;

    public Camara(String Marca, String Modelo, double Precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
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