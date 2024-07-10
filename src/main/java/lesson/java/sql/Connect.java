package lesson.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static void connect() {
        Connection conn = null;


        try {
            String url = "jdbc:sqlite:mSql";
            conn = DriverManager.getConnection(url);
            System.out.println("База подключена");
        } catch (SQLException e) {
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