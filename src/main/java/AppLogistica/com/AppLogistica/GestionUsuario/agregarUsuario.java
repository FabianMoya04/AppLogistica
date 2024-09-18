package AppLogistica.com.AppLogistica.GestionUsuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public Usuario agregarUsuario(Usuario usuario) {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String passwordEncriptada = encoder.encode(usuario.getContraseña());
    usuario.setContraseña(passwordEncriptada);
    return usuarioRepository.save(usuario);
}
