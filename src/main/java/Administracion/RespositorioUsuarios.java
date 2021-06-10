package Administracion;

import java.util.List;

public class RespositorioUsuarios {
  List<Usuario> usuarios;

  void actualizarPrendasDeUsuarios() {
    usuarios.forEach(Usuario::actualizarSugerencia);
  }

  void actualizarAlertas() {
    usuarios.forEach(Usuario::actualizarAlertas);
  }

}
