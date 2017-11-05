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
public class FacturaVenta {
    private int id;
    private int numero;
    private int codigoControl;
    private int codigoCr;
    private String fechaLimite;

    public FacturaVenta(int id, int numero, int codigoControl, int codigoCr, String fechaLimite) {
        this.id = id;
        this.numero = numero;
        this.codigoControl = codigoControl;
        this.codigoCr = codigoCr;
        this.fechaLimite = fechaLimite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoControl() {
        return codigoControl;
    }

    public void setCodigoControl(int codigoControl) {
        this.codigoControl = codigoControl;
    }

    public int getCodigoCr() {
        return codigoCr;
    }

    public void setCodigoCr(int codigoCr) {
        this.codigoCr = codigoCr;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    
    
}
