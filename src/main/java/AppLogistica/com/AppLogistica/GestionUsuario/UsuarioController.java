package AppLogistica.com.AppLogistica.GestionUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping
    public Usuario agregar(@RequestBody Usuario usuario) {
        return usuarioService.agregarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario editar(@PathVariable String id, @RequestBody Usuario usuario) {
        usuario.setIdUsuario(id);
        return usuarioService.editarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        usuarioService.eliminarUsuario(id);
    }
}
