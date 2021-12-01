
package MySQL_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    
    Connection con = null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tarea4","root","tr.1993001193");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: "+e);
        }
        return con;
    }
}
