import java.util.ArrayList;
public class ControlAscensor {

    private int pisoActual;
    private String direccion;   // "SUBIDA" o "BAJADA"
    private boolean falla;
    private ArrayList<Integer> solicitudes;

    public ControlAscensor(int pisoActual) {
        this.pisoActual = pisoActual;
        this.direccion = "SUBIDA";
        this.falla = false;
        this.solicitudes = new ArrayList<Integer>();
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public void agregarSolicitud(int piso) {
        if (!solicitudes.contains(piso)) {
            solicitudes.add(piso);
        }
    }

    // Busca la próxima parada en la dirección actual
    private int siguienteParada() {
        int mejor = -1;
        for (int p : solicitudes) {
            if (direccion.equals("SUBIDA") && p >= pisoActual) {
                if (mejor == -1 || p < mejor) {
                    mejor = p;
                }
            } else if (direccion.equals("BAJADA") && p <= pisoActual) {
                if (mejor == -1 || p > mejor) {
                    mejor = p;
                }
            }
        }
        return mejor;
    }

    // Solo cambia de dirección cuando no hay más solicitudes en la actual
    public void cambiarDireccion() {
        if (direccion.equals("SUBIDA")) {
            direccion = "BAJADA";
        } else {
            direccion = "SUBIDA";
        }
        System.out.println("Cambio de dirección: " + direccion);
    }

    public void moverAscensor() {
        while (!solicitudes.isEmpty() && !falla) {
            int destino = siguienteParada();
            if (destino == -1) {
                cambiarDireccion();
            } else {
                pisoActual = destino;
                solicitudes.remove(Integer.valueOf(destino));
                System.out.println("El ascensor llegó al piso " + pisoActual);
            }
        }
    }

    public void detener() {
        falla = true;
        System.out.println("Ascensor detenido en el piso " + pisoActual);
    }
}