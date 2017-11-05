package capa.negocio;

/**
 *
 * @author Jose Maria
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellidos;
    private String nit;
    private String fechaNac;
    private String direccion; 

    public Cliente(int id, String nombre, String apellidos, String nit, String fechaNac, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nit = nit;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
