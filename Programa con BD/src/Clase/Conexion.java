
package Clase;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection conectar=null;
    public Connection SQLConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/bd_empleado", "root", "");
            System.out.println("Conexión Existosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e,"ERROR",JOptionPane.PLAIN_MESSAGE);
        }
        return conectar;
    }
    
}
