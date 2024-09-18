package AppLogistica.com.AppLogistica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://34.39.135.46:3306/gestion_inventario";
    private static final String USER = "root";
    private static final String PASSWORD = "gestion";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
}
}
