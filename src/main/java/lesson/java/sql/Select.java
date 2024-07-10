package lesson.java.sql;

import java.sql.*;

public class Select {
    public static Connection connect() {
        Connection conn = null;


        try {
            String url = "jdbc:sqlite:SqliteMy";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return conn;
    }


    public  void selectAll() {
        String sql = "select * from FirstLast";

        try (Connection conn = connect()) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(
                        res.getInt("id") + "\t" +
                        res.getString("first_name") + "\t" +
                        res.getString("last_name")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public  void upRegister() {
        String sql = "select upper(first_name) from FirstLast";

        try (Connection conn = connect()) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(res.getString(1));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public  void getId() {
        String sql = "select id from FirstLast";

        try (Connection conn = connect()) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(res.getInt("id"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public  void getChar() {
        String sql = "select first_name ,substring(first_name,1,3) from FirstLast";

        try (Connection conn = connect()) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(

                                res.getString(2)

                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public  void getStringTable() {
        String sql = "select * from FirstLast limit (5)";

        try (Connection conn = connect()) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(
                        res.getInt("id") + "\t" +
                                res.getString("first_name") + "\t" +
                                res.getString("last_name")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }



}
