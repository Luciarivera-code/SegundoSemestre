public class CursoEstudiantes {

    private String codigo;
    private String nombre;
    private String docente;
    private int creditos;
    private int cupoMaximo;
    private int inscritos = 0;

    public CursoEstudiantes(String codigo, String nombre, int creditos, String docente, int cupoMaximo){

        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
        this.cupoMaximo = cupoMaximo;
        
    }

    public String getCodigo(){ 
        return codigo; 
    }

    public void setCodigo(String c){ 
        this.codigo = c; 
    }

    public String getNombre(){ 
        return nombre; 
    }

    public void setNombre(String n){
        this.nombre = n; 
    }

    public int getCreditos(){
        return creditos; 
    }

    public void setCreditos(int c){ 
        if(c>0) this.creditos = c; 
    }

    public String getDocente(){
        return docente; 
    }

    public void setDocente(String d){ 
        this.docente = d; 
    }

    public int getCupoMaximo(){
        return cupoMaximo; 
    }

    public void setCupoMaximo(int c){
        if(c>0) this.cupoMaximo = c; 
    }

    public void mostrarInformacion(){
        System.out.println(this.toString()); 
    }

    public boolean tieneCupo(){
        return inscritos < cupoMaximo; 
    }

    public boolean inscribir(){
        if(tieneCupo()){inscritos++; return true;} return false; 
    }

    public void getinscribir(){
        inscribir();
    }

    @Override
    public String toString() {
        return "Curso [codigo: " + codigo + ", nombre: " + nombre + ", creditos: " + creditos + ", docente: " + docente + ", cupo: " + inscritos + "/" + cupoMaximo + "]";
    }
}