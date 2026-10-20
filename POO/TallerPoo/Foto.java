public class Foto {

    private String Fichero;
    private String estilo;
    private String tamaño;
    private Date fecha;

    public Foto(String Fichero, String estilo, String tamaño, Date fecha) {
        this.Fichero= Fichero;
        this.estilo= estilo;
        this.tamaño= tamaño;
        this.fecha= fecha;
    }
    public String getFichero(){
        return Fichero;
    }
    System.out.println(this.Fichero);
}
