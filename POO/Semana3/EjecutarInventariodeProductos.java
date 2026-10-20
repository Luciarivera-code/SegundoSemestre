public class EjecutarInventariodeProductos {
public static void main (String[]args){

    InventariodeProductos objInventariodeProductos1 = new InventariodeProductos (017, "cuadernos", 23, 2600);
    InventariodeProductos objInventariodeProductos2 = new InventariodeProductos (023, "marcadores", 4, 3000);

System.out.println(objInventariodeProductos1);
System.out.println("InventariodeProductos: " + objInventariodeProductos1.toString());
System.out.println(objInventariodeProductos2);
System.out.println("total: " + objInventariodeProductos2.calcularTotal());
}
}