public class Proveedor {
    
    private String nit;
    private String nombre;
    private String telefono;
    private String correo;

    public Proveedor(String nit, String nombre, String telefono, String correo) {
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    public String getNit() { return nit; }
    public void setNit(String n) { if(n != null) this.nit = n; }
    public String getNombre() { return nombre; }
    public void setNombre(String n) { if(n != null && !n.isEmpty()) this.nombre = n; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String t) { this.telefono = t; }
    public String getCorreo() { return correo; }
    public void setCorreo(String c) { if(c.contains("@")) this.correo = c; }

    public boolean esConfiable() { return correo != null && telefono != null; }
    public void mostrarInfo() { System.out.println(this.toString()); }
    public void actualizarContacto(String tel, String correo) { setTelefono(tel); setCorreo(correo); }

    @Override
    public String toString() { return "Proveedor [nit: "+nit+", nombre: "+nombre+"]"; }
}