import java.sql.*;

public class DBprocessor {

    private Connection con;

    public Connection connection  (String url, String usename, String password) throws SQLException {
        con = DriverManager.getConnection(url, usename, password);
        return con;
    }
}
