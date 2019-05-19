
package banking_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JavaConnect {
    public static Connection ConnectDb() throws ClassNotFoundException, SQLException{
        Connection connection = null;    
        Class.forName("com.mysql.jdbc.Driver");
         connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","123456");
    
    
    return connection;
    }
    
}
