package capa.negocio;

/**
 *
 * @author Jose Maria
 */
public class Proveedor {
    private int id;
    private String codigo;
    private String nombre;
    private String razonSocial;
    private String direccion;
    private String telefono;
    private String Email;

    public Proveedor(int id, String codigo, String nombre, String razonSocial, String direccion, String telefono, String Email) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.Email = Email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
