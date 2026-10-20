public class EjecutarProductoyVenta {

    public static void main (String[]args){
        ProductoyVenta p1 = new ProductoyVenta("2305", "Victoria Secret", 85.990, 5 );
        ProductoyVenta p2 = new ProductoyVenta("7233", "Dove", 35660, 15);
        ProductoyVenta p3 = new ProductoyVenta("8928", "Nivea", 25000, 8);

    System.out.println("Producto: " + p1.getproductoconcodigo());
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    
    System.out.println(p1.getproductoconcodigo());
    p1.setproductoconcodigo("2305-01");
    p1.vender(3);
    System.out.println(p1);

    System.out.println("Producto: " + p2.getnombre());
    p2.setproductoconcodigo("63776");
    p2.reabastecer(6);
    System.out.println(p2);
    
    System.out.println(p3.calcularValorInventario());
 }
 }