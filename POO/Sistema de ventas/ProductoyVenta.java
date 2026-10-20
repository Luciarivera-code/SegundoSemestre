public class ProductoyVenta{
    
    private String productoconcodigo;
    private String nombre;
    private double precio;
    private int stock;

    public ProductoyVenta(String productoconcodigo, String nombre, double precio, int stock){

        this.productoconcodigo = productoconcodigo;
        this.nombre = nombre;
        this.precio = precio; 
        this.stock = stock;
    }

    public String getproductoconcodigo(){
        return productoconcodigo;
    }
    public void setproductoconcodigo(String productoconcodigo){
        this.productoconcodigo = productoconcodigo;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public double getprecio(){
        return precio;
    }
    public void setprecio(double precio){
        this.precio = precio;
    }
    public int getstock(){
        return stock;
    }
    public void setstock(int stock){
        this.stock = stock;
    }

    @Override 
    public String toString(){
        return "ProductoyVenta [productoconcodigo: " + productoconcodigo + " nombre: " + nombre + " precio: " + precio + " stock: " + stock +"]";
    }
    public boolean vender(int cantidad){
        if (cantidad <= 0|| cantidad > stock) return false;
        stock -= cantidad;
        return true;
        }
    public void reabastecer (int cantidad){
        if (cantidad > 0) stock += cantidad;
        stock += cantidad;
    }
    public double calcularValorInventario(){
        return precio * stock;
    }
    }