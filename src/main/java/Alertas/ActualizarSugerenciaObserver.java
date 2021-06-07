package Alertas;

import Administracion.Usuario;

import java.util.List;

public class ActualizarSugerenciaObserver implements AlertaClimaticaObserver {

  public void recibirAlertas(Usuario usuario, List<String> alertasPublicadas) {
    //Cambiar para guardarropas
    usuario.actualizarSugerencia(usuario.guardarropaAleatorio());
  }
}
