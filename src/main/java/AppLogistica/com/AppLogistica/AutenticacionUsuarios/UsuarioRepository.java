package AppLogistica.com.AppLogistica.AutenticacionUsuarios;

import AppLogistica.com.AppLogistica.AutenticacionUsuarios.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Usuario findByEmail(String email); // Método para encontrar usuario por email
}
