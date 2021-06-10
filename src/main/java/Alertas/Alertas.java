package Alertas;

import Administracion.Usuario;
import Sugerencias.Sugerencia;

import java.util.List;

public class Alertas {
  List<String> alertasPublicadas;
  List<AlertaClimaticaObserver> observersAlerta;

  public void actualizarAlertas(Usuario usuario) {
    alertasPublicadas = Sugerencia.getAlertas(usuario.ciudadResidencia());
    if (!alertasPublicadas.isEmpty())
      observersAlerta.forEach(observer -> observer.recibirAlertas(usuario, alertasPublicadas));
  }

  //Externamente se van a agregar las notifiaciones y sucesos que creamos al principio
  //Y despues el usuario puede usar este metodo para activar despues de desactivar
  public void agregarAlertaClimatica(AlertaClimaticaObserver alertaClimaticaObserver) {
    observersAlerta.add(alertaClimaticaObserver);
  }

  public void desactivarAlertaClimatica(AlertaClimaticaObserver alertaClimaticaObserver) {
    observersAlerta.remove(alertaClimaticaObserver);
  }

}