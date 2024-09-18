
package AppLogistica.com.AppLogistica.GestionCliente;

import AppLogistica.com.AppLogistica.GestionCliente.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
