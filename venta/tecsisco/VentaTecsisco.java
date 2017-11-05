/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta.tecsisco;

import capa.dato.Conection;
import java.sql.Connection;

/**
 *
 * @author Jose Maria
 */
public class VentaTecsisco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conection con;
        con = new Conection();
        Connection reg = con.getConnection();
    }
    
}
