package capa.negocio;

/**
 *
 * @author Jose Maria
 */
public class Empresa {
    private int id;
    private String nombreEmpresa;
    private String razonSocial;
    private String nit;
    private String nroAutorizacion;

    public Empresa(int id, String nombreEmpresa, String razonSocial, String nit, String nroAutorizacion) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.nroAutorizacion = nroAutorizacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNroAutorizacion() {
        return nroAutorizacion;
    }

    public void setNroAutorizacion(String nroAutorizacion) {
        this.nroAutorizacion = nroAutorizacion;
    }
}
