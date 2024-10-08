package AppLogistica.com.AppLogistica.GestionProducto;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ProductoRepository extends MongoRepository<Producto, String> {
    List<Producto> findByNombreProductoContaining(String nombre);
    List<Producto> findByIdCategoria(String idCategoria);
}
