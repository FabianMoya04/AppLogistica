package AppLogistica.com.AppLogistica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:8080/mi_base_de_datos";//poner la url
    private static final String USER = "mi_usuario";//poner el usuario
    private static final String PASSWORD = "mi_contraseña";// poner la contraseña

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
