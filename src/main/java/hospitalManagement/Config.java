package hospitalManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

    public static Connection getConnection() {
          final String url = "jdbc:mysql://localhost:3306/hospital";
          final String username = "root";
          final String password = "admin";
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

        return connection;
    }

}
