package barberiapelofino;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ClsConnectionDB {
    private final String HOST = "localhost";
    private final String PORT = "5432";
    private final String DB = "PeloFino";
    private final String USER = "postgres";
    private final String PASSWORD = "admin";
    
    public Connection getConnection(){
        Connection conexion = null;
        
        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://"+HOST+":"+PORT+"/"+DB;
            conexion = DriverManager.getConnection(url, USER,PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return conexion;
    }
}
