public class Cliente {

    private String nombre;
    private String documento;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String documento, String direccion, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
        // System.out.println(Cliente.getNombre());
    }

    public String getDocumento() {
        return documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", documento=" + documento + ", direccion=" + direccion + ", telefono="
                + telefono + "]";
    }

    
}