package mysql_sql_local;

import java.sql.*;

public class ViewTable implements Selectable {
    Connection connect;

    ViewTable(Connection connect) {
        this.connect = connect;
    }

    @Override
    public void getTable(String sql) {
        try (Connection conn = connect) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(
                        res.getInt("EMPLOYEE_ID") + "\t" +
                                res.getString("FIRST_NAME") + "\t" +
                                res.getString("LAST_NAME") + "\t" +
                                res.getString("EMAIL") + "\t" +
                                res.getString("PHONE_NUMBER") + "\t" +
                                res.getString("HIRE_DATE") + "\t" +
                                res.getString("JOB_ID") + "\t" +
                                res.getString("SALARY")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void getNameAndLastFromTable(String sql) {
        try (Connection conn = connect) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(
                        res.getString("FIRST_NAME") + "\t" + " | " + res.getString("LAST_NAME")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void getMaxValue(String sql){
        try (Connection conn = connect) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                System.out.println(
                        res.getString("FIRST_NAME") + "\t" + " | " +  res.getDouble(2)
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
@Override
    public void getMinValue(String sql){
        try (Connection conn = connect) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                System.out.println(
                        res.getString("FIRST_NAME") + "\t" + " | " +  res.getDouble(2)
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getEven(String sql) {
        try (Connection conn = connect) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(
                        res.getInt("EMPLOYEE_ID") + "\t" +
                                res.getString("FIRST_NAME") + "\t" +
                                res.getString("LAST_NAME") + "\t" +
                                res.getString("EMAIL") + "\t" +
                                res.getString("PHONE_NUMBER") + "\t" +
                                res.getString("HIRE_DATE") + "\t" +
                                res.getString("JOB_ID") + "\t" +
                                res.getString("SALARY")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getOod(String sql) {
        try (Connection conn = connect) {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()) {
                System.out.println(
                        res.getInt("EMPLOYEE_ID") + "\t" +
                                res.getString("FIRST_NAME") + "\t" +
                                res.getString("LAST_NAME") + "\t" +
                                res.getString("EMAIL") + "\t" +
                                res.getString("PHONE_NUMBER") + "\t" +
                                res.getString("HIRE_DATE") + "\t" +
                                res.getString("JOB_ID") + "\t" +
                                res.getString("SALARY")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
