public class Producto {

    private double Precio;
    private int Numero;
    private int Cantidad;
    private String Nombre;

    public Producto(double Precio, int Numero, int Cantidad, String Nombre) {
        this.Precio = Precio;
        this.Numero = Numero;
        this.Cantidad = Cantidad;
        this.Nombre = Nombre;
    }

    public void Marca() {
    }

    public void Modelo() {
    }

    public void Precio() {
    }

    public void Color() {
    }

    public void Tamaño() {
    }

    public void Foto() {
    }

    @Override
    public String toString() {
        return "Producto [Precio=" + Precio + " Numero=" + Numero + " Cantidad=" + Cantidad + " Nombre=" + "]";
    }
}