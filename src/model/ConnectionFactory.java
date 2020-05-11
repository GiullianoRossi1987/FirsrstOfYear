
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
        public Connection getConnection() throws RuntimeException, ClassNotFoundException{
            try{
                Class.forName("com.mysql.jdbc.Driver");  // <Giulliano> Verifique se o driver esta junto do classpath
                return DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital","root","usbw");
            }
            catch(SQLException e){
                throw new RuntimeException(e.getMessage());
            }
        
        }
    
}
