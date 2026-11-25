import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Estoy en el piso 5 y presiono el botón de bajar....");
        Boton botonBajarPiso5 = new BotonPiso(true, true, 5, "bajar");
        botonBajarPiso5.presionarBoton(); //Cambia el estado...subir o bajar
        System.out.println(botonBajarPiso5);
        System.out.println("Se abren las puertas del piso....");
        System.out.println("Se abren las puertas del ascensor....");
        System.out.println("Entra la persona al ascensor");
        System.out.println("Presiona el boton que lo lleva al piso 1");
        Boton botonPiso1 = new BotonAscensor(true, true, 5, 1);
        botonPiso1.presionarBoton(); //Muestra si está subiendo o esta bajando....
        System.out.println(botonPiso1);    
    }
        ControlAscensor control = new ControlAscensor(1);
        PuertaAscensor puertaAsc = new PuertaAscensor(false, false);
        SistemaControl sistema = new SistemaControl(control, puertaAsc);

        sistema.agregarPuertaPiso(new PuertaPiso(false, false, 3));

        // Polimorfismo: variables de tipo Boton, objetos de tipo hijo
        Boton b1 = new BotonPiso(false, false, 3, "SUBIDA");
        Boton b2 = new BotonAscensor(false, false, 1, 5);
        sistema.presionarBoton(b1);
        sistema.presionarBoton(b2);

        control.agregarSolicitud(3);
        control.agregarSolicitud(5);
        control.agregarSolicitud(2);
        control.moverAscensor();

        sistema.llegarAPiso(control.getPisoActual());

        // Prueba del sensor de obstáculo
        PuertaObstaculo pSensor = new PuertaObstaculo(true, false, true);
        pSensor.detectarObstaculo(true);
        pSensor.cerrar();
        pSensor.mantenerAbierta();

        sistema.reportarFalla("Botón del piso 3");
        sistema.mostrarRegistro();
    }
}