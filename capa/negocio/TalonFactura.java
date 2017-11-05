/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa.negocio;

/**
 *
 * @author Jose Maria
 */
public class TalonFactura {
    private int id;
    private int codigoTalonario;
    private String descripcion;
    private int nroAutorizacion;
    private String llaveDosificacion;
    private int codigoSucursal;
    private int facturaActual;
    private String fechaLimite;
    private String fechaRegistro;

    public TalonFactura(int id, int codigoTalonario, String descripcion, int nroAutorizacion, String llaveDosificacion, int codigoSucursal, int facturaActual, String fechaLimite, String fechaRegistro) {
        this.id = id;
        this.codigoTalonario = codigoTalonario;
        this.descripcion = descripcion;
        this.nroAutorizacion = nroAutorizacion;
        this.llaveDosificacion = llaveDosificacion;
        this.codigoSucursal = codigoSucursal;
        this.facturaActual = facturaActual;
        this.fechaLimite = fechaLimite;
        this.fechaRegistro = fechaRegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoTalonario() {
        return codigoTalonario;
    }

    public void setCodigoTalonario(int codigoTalonario) {
        this.codigoTalonario = codigoTalonario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNroAutorizacion() {
        return nroAutorizacion;
    }

    public void setNroAutorizacion(int nroAutorizacion) {
        this.nroAutorizacion = nroAutorizacion;
    }

    public String getLlaveDosificacion() {
        return llaveDosificacion;
    }

    public void setLlaveDosificacion(String llaveDosificacion) {
        this.llaveDosificacion = llaveDosificacion;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public int getFacturaActual() {
        return facturaActual;
    }

    public void setFacturaActual(int facturaActual) {
        this.facturaActual = facturaActual;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
}
