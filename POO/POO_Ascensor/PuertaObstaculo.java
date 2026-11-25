    // Puerta con sensor de seguridad
public class PuertaObstaculo extends Puerta {

    private boolean sensorActivo;

    public PuertaObstaculo(boolean abierta, boolean obstaculo, boolean sensorActivo) {
        super(abierta, obstaculo);
        this.sensorActivo = sensorActivo;
    }

    public void detectarObstaculo(boolean hayObstaculo) {
        obstaculo = hayObstaculo;
        if (sensorActivo && hayObstaculo) {
            System.out.println("Sensor: obstáculo detectado, se reabre la puerta");
            abrir();
        }
    }

    // Polimorfismo: sobrescribe cerrar() con el comportamiento del sensor
    @Override
    public void cerrar() {
        if (sensorActivo && obstaculo) {
            System.out.println("Sensor impide el cierre de la puerta");
        } else {
            abierta = false;
            System.out.println(getTipo() + " cerrada");
        }
    }

    @Override
    public String getTipo() {
        return "Puerta con sensor";
    }
}