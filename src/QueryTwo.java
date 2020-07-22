import java.sql.SQLException;
import java.sql.Statement;

public class QueryTwo extends Thread {

    private Statement statement;
    private String sqlQuery;

    public QueryTwo(Statement stmt, String sql) {
        this.statement = stmt;
        this.sqlQuery = sql;
    }

    @Override
    public void run() {
        System.out.println("Выполняется поток 2");
        try {

            statement.executeUpdate(sqlQuery);

        } catch (SQLException ex) {

            System.out.println("Ошибка при выполнении запроса");
            ex.printStackTrace();

        }

    }

}