import java.util.ArrayList;

public class SistemaControl {

    private ControlAscensor control;
    private ArrayList<Boton> botones;
    private PuertaAscensor puertaAscensor;
    private ArrayList<Puerta> puertasPiso;
    private ArrayList<String> registro;
    private long horaInicio;

    public SistemaControl(ControlAscensor control, PuertaAscensor puertaAscensor) {
        this.control = control;
        this.puertaAscensor = puertaAscensor;
        this.botones = new ArrayList<Boton>();
        this.puertasPiso = new ArrayList<Puerta>();
        this.registro = new ArrayList<String>();
        this.horaInicio = System.currentTimeMillis();
    }

    public void agregarBoton(Boton b) {
        botones.add(b);
    }

    public void agregarPuertaPiso(Puerta p) {
        puertasPiso.add(p);
    }

    public void presionarBoton(Boton b) {
        b.presionarBoton();   // Polimorfismo: se ejecuta el de BotonPiso o BotonAscensor
        registrarActividad("Botón presionado: " + b);
    }

    // Abre y cierra puertas automáticamente al llegar a un piso
    public void llegarAPiso(int piso) {
        puertaAscensor.abrir();
        for (Puerta p : puertasPiso) {
            p.abrir();
        }
        puertaAscensor.cerrar();
        for (Puerta p : puertasPiso) {
            p.cerrar();
        }
        registrarActividad("Llegada al piso " + piso);
    }

    // Alerta de falla: detiene el ascensor y abre las puertas
    public void reportarFalla(String componente) {
        System.out.println("ALERTA al equipo de mantenimiento: falla en " + componente);
        control.detener();
        puertaAscensor.abrir();
        registrarActividad("FALLA en " + componente);
    }

    public void registrarActividad(String evento) {
        registro.add(evento);
    }

    public void mostrarRegistro() {
        long segundos = (System.currentTimeMillis() - horaInicio) / 1000;
        System.out.println("--- Registro (funcionando " + segundos + " s) ---");
        for (String e : registro) {
            System.out.println(e);
        }
    }
}