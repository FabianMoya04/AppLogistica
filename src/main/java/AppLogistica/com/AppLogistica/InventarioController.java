package AppLogistica.com.AppLogistica;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @PostMapping("/agregar")
    public void agregarInventario(@RequestBody Inventario inventario) throws SQLException {
        inventarioService.agregarInventario(inventario);
    }
}
