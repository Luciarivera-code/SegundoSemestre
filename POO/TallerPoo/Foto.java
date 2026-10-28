import java.util.*;

public class Foto {

    private String Fichero;
    private String estilo;
    private String tamano;
    private Date fecha;

    public Foto(String Fichero, String estilo, String tamano, Date fecha) {
        this.Fichero= Fichero;
        this.estilo= estilo;
        this.tamano= tamano;
        this.fecha= fecha;
    }
    public String getFichero(){
        return Fichero;
    }
    
    @Override
    public String toString() {
        return "Foto [Fichero=" + Fichero + ", estilo=" + estilo + ", tamano=" + tamano + ", fecha=" + fecha + "]";
    }
    
    
}
