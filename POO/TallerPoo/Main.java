import java.text.DateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        
        Cliente cliente = new Cliente("Johana", "1728373847", "Cl 8 #37-38", "322937492");
        
        Foto[] foto = { new Foto("trabajo.jpg", "Fondo Azul", "4X3", new Date()) };

        Impresion impresion = new Impresion(600.0, 1, 2, "Impresión", "Shepia", "4X3", foto);

        Camara camara = new Camara(1000.0, 2, 3, "Camara", "Canon", "EOS34", 1250.0);

        Producto[] productos = {impresion, camara};

        TarjetaCredito pagoTC = new TarjetaCredito("Tarjeta de Crédito","456798");

        Pedido pedido = new Pedido(cliente, productos, new Date(), 32569874, pagoTC);

        System.out.println(pedido);
    }
}