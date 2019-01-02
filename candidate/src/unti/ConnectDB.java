package unti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    static final String DIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/nhansu";
    static final String USER_NAME = "root";
    static final String PASSWORD = "hoangthap1";

    public static Connection connect() {
        // load driver
        try {
            Class.forName(DIVER);
           
        } catch (

        ClassNotFoundException e) {
            e.printStackTrace();
        
        }
// get connection instance
        Connection cnn = null;
        try {
            cnn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
       
        } catch (SQLException e) {
            e.printStackTrace();
           
        }
        return cnn;
    }

 
}
