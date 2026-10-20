public class Categoria {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private boolean activa;

    public Categoria(String codigo, String nombre, String descripcion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activa = true;
    }
    public String getCodigo(){
        return codigo; 
    }

    public void setCodigo(String c){ 
        if(c != null && !c.isEmpty()) this.codigo = c; 
    }

    public String getNombre(){ 
        return nombre; 
    }

    public void setNombre(String n){ 
        if(n != null) this.nombre = n; 
    }

    public String getDescripcion(){ 
        return descripcion;
    }

    public void setDescripcion(String d){ 
        this.descripcion = d; 
    }

    public boolean isActiva(){ 
        return activa; 
    }

    public void desactivar(){
        this.activa = false; 
    }
    public void activar(){
        this.activa = true; 
    }

    public void mostrarInfo(){ 
        System.out.println(this.toString()); 
    }

    @Override
    public String toString(){ 
        return "Categoria ["+codigo+", "+nombre+", activa: "+activa+"]"; 
    }
}