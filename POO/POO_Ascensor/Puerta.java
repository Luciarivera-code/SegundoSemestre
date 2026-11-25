// Clase padre ABSTRACTA
public abstract class Puerta {

    protected boolean abierta;
    protected boolean obstaculo;

    public Puerta(boolean abierta, boolean obstaculo) {
        this.abierta = abierta;
        this.obstaculo = obstaculo;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setObstaculo(boolean obstaculo) {
        this.obstaculo = obstaculo;
    }

    public void abrir() {
        abierta = true;
        System.out.println(getTipo() + " abierta");
    }

    public void cerrar() {
        if (obstaculo) {
            System.out.println(getTipo() + ": hay un obstáculo, no se puede cerrar");
        } else {
            abierta = false;
            System.out.println(getTipo() + " cerrada");
        }
    }

    // Botón "Mantener puertas abiertas"
    public void mantenerAbierta() {
        abierta = true;
        System.out.println(getTipo() + " se mantiene abierta");
    }

    // Cada hija dice qué tipo de puerta es
    public abstract String getTipo();
}