package lesson.java.sql.my_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {


    public static void connect() {
        Connection conn = null;
         String url = "jdbc:mysql://localhost:3306/mydatabase";
         String user = "user1";
         String password = "1234567";

        try {
           // Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("База подключена");
        } catch (SQLException  e) {
            e.getStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.getStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        connect();
    }
}
