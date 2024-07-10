package mysql_sql_local;

import java.sql.*;

public class Connect {
    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:mySql.local";
            conn = DriverManager.getConnection(url);
            System.out.println("База подключена");
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        ViewTable viewTable = new ViewTable(connect());
        //Напишитезапрос,чтобыотобразитьимяифамилиювсехсотрудников,вименахкоторыхесть«b»и«c»
//       viewTable.getTable("SELECT * FROM Users");
        //Напишитезапрос,чтобыотобразитьимя(имя,фамилия)идатуприеманаработудлявсехсотрудников,которыебылипринятынаработув1987году
//        viewTable.getNameAndLastFromTable("SELECT FIRST_NAME,LAST_NAME FROM Users  WHERE HIRE_DATE LIKE '%1987%'");
        //Напишитезапрос,чтобыполучитьмаксимальнуюиминимальнуюзарплатуизтаблицысотрудников
        //     viewTable.getMaxValue("SELECT FIRST_NAME ,MAX(SALARY) from Users" );
        //  viewTable.getMinValue( "SELECT FIRST_NAME ,MIN(SALARY) from Users ");
        //четные и нечетные
        viewTable.getEven("SELECT * FROM Users  WHERE EMPLOYEE_ID % 2 = 0");
        viewTable.getOod("SELECT * FROM Users  WHERE EMPLOYEE_ID % 2 != 0");
    }


}
