package AppLogistica.com.AppLogistica.GestionUsuario;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
@Data
public class Usuario {
    @Id
    private String idUsuario;
    private String nombreCompleto;
    private String email;
    private String contraseña;  // Asegúrate de manejar la seguridad de las contraseñas
    private String telefono;
    private String rol;   // Ej: ADMIN, USER, etc.
}
