package AppLogistica.com.AppLogistica.GestionCategoria;

import AppLogistica.com.AppLogistica.GestionProducto.Producto;
import AppLogistica.com.AppLogistica.GestionProducto.ProductoService;
import AppLogistica.com.AppLogistica.GestionProducto.ProductoController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@GetMapping("/categoria/{idCategoria}")
public List<Producto> listarPorCategoria(@PathVariable String idCategoria) {
    return ProductoService.listarProductosPorCategoria(idCategoria);
}
