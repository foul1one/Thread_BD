import java.sql.*;

public class Main {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";

    public static void main(String[] args) throws SQLException {

        DBprocessor db = new DBprocessor();
        Connection connection = db.connection(URL, USERNAME, PASSWORD);

        Statement statement = connection.createStatement();

        String sql1 = "insert into business.products (price, product_name, shop_id) values (120, 'Apple', 2);";
        String sql2 = "insert into business.shops (address, shop_name) values ('Улица Пушкина, дом Колотушкина', 'Василёк');";

        QueryOne qo = new QueryOne(statement, sql1);
        QueryTwo qt = new QueryTwo(statement, sql2);

        qo.start();
        qt.start();

       /* statement.close();
        connection.close();*/ // как закрыть соединение после выполнения двух потоков???

    }

}