package AppLogistica.com.AppLogistica.GestionUsuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    // Puedes agregar métodos de búsqueda si lo necesitas
}
