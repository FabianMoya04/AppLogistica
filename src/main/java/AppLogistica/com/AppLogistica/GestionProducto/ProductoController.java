package AppLogistica.com.AppLogistica.GestionProducto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listar() {
        return productoService.listarProductos();
    }

    @PostMapping
    public Producto agregar(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

    @PutMapping("/{id}")
    public Producto editar(@PathVariable String id, @RequestBody Producto producto) {
        producto.setIdProducto(id);
        return productoService.editarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        productoService.eliminarProducto(id);
    }

    @GetMapping("/buscar")
    public List<Producto> buscar(@RequestParam String nombre) {
        return productoService.buscarProducto(nombre);
    }
}
