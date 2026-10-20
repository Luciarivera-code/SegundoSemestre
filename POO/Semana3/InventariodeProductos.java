public class InventariodeProductos {
    
    private int id;
    private String producto;
    private int cantidad;
    private double precio;
 

public InventariodeProductos (int id, String producto, int cantidad, double precio){
    
    this.id= id;
    this.producto= producto;
    this.cantidad=cantidad;
    this.precio= precio;
}
public String toString (){
    return "InventariodeProductos [ id: " + id + "producto: " + producto + " cantidad: " + cantidad + " precio: " + precio + "]";
}
public double calcularTotal(){
    return cantidad * precio;
}
}