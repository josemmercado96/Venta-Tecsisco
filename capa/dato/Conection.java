package capa.dato;

/**
 *
 * @author Jose Maria
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    private static Connection conect;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/venta";

    public Conection() {
        conect = null;
        try {
            Class.forName(driver);
            conect = DriverManager.getConnection(url, user, password);
            
            if (conect != null) {
                System.out.println("Conexión Establecida...");
            }
        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error al Conectar" + e);
        }
    }
    
    public Connection getConnection() {
        return conect;
    }
      
    public void desconectar() {
        conect = null;
        if (conect == null) {
            System.out.println("Conexión Interrumpida..");
        }
    }
}
