
package Project;
import java.sql.*;

/**
 *
 * @author User
 */
public class ConnectionProvider {

   
    public static Connection main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mysql?useSSL=true";
        String user="root";
        String pass="1315418698";
        
       try{
           
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       
       Connection conn = DriverManager.getConnection(url,user,pass);
       return conn;
       
       
       }
       catch(Exception e){
           return null;
       }
    }

    public static Connection getcon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}