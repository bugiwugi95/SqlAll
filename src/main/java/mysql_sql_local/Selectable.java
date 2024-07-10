package mysql_sql_local;

public interface Selectable {

     void getTable(String sql);

     void getNameAndLastFromTable(String sql);

     void getMaxValue(String sql);

      void getMinValue(String sql);

      void getEven(String sql);

     void getOod(String sql);
}
