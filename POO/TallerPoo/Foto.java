import java.util.Date;

public class Foto{

    private String Fichero;
    private String Estilo;
    private String Tamaño;
    private Date Fecha;

    public Foto(String Fichero, String Estilo, String Tamaño, Date Fecha){
        this.Fichero= Fichero;
        this.Estilo= Estilo;
        this.Tamaño= Tamaño;
        this.Fecha= Fecha;
    }

    public String getFichero() {
        return Fichero;
    }

    public void print() {
        System.out.println(this.Fichero);
    }
}