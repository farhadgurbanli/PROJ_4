package database;

import java.sql.Connection;
import java.sql.DriverManager;


public class connectionstring {
        public static Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/baza";
        String usr = "root";
        String dbPass = "root";
        Connection c = DriverManager.getConnection(url, usr, dbPass);
        return c;
    }
}
