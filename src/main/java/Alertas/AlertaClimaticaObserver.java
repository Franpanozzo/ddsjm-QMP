package Alertas;

import Administracion.Usuario;

import java.util.List;

public interface AlertaClimaticaObserver {

  void recibirAlertas(Usuario usuario, List<String> alertasPublicadas);

}
