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
public class Venta {
    private int id;
    private String fecha;
    private float subTotal;
    private float iva;
    private float montoTotal;

    public Venta(int id, String fecha, float iva, float montoTotal) {
        this.id = id;
        this.fecha = fecha;
        this.iva = iva;
        this.montoTotal = montoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
}
