package AppLogistica.com.AppLogistica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InventarioService {

    public void agregarInventario(Inventario inventario) throws SQLException {
        String sql = "INSERT INTO Inventario (producto_id, ubicacion_id, cantidad, estado) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, inventario.getProducto().getId());
            statement.setInt(2, inventario.getUbicacion().getId());
            statement.setInt(3, inventario.getCantidad());
            statement.setString(4, inventario.getEstado());

            statement.executeUpdate();
        }
    }
}
