package AppLogistica.com.AppLogistica.GestionCategoria;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categorias")
@Data
public class Categoria {
    @Id
    private String idCategoria;
    private String nombreCategoria;
}
