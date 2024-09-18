package AppLogistica.com.AppLogistica.GestionCategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.listarCategorias();
    }

    @PostMapping
    public Categoria agregar(@RequestBody Categoria categoria) {
        return categoriaService.agregarCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Categoria editar(@PathVariable String id, @RequestBody Categoria categoria) {
        categoria.setIdCategoria(id);
        return categoriaService.editarCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        categoriaService.eliminarCategoria(id);
    }
}
