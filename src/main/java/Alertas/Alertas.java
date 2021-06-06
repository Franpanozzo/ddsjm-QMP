package Alertas;

import Administracion.Usuario;
import Sugerencias.Sugerencia;

import java.util.List;

public class Alertas {
  List<String> alertasPublicadas;
  Usuario usuario;
  List<AlertaClimaticaObserver> observersAlerta;

  public Alertas(Usuario usuario) {
    this.usuario = usuario;
  }

  public void actualizarAlertas() {
    alertasPublicadas = Sugerencia.getAlertas();
    if(!alertasPublicadas.isEmpty())
      observersAlerta.forEach(observer -> observer.recibirAlertas(this));
  }

  //Externamente se van a agregar las notifiaciones y sucesos que creamos al principio
  //Y despues el usuario puede usar este metodo para activar despues de desactivar
  public void agregarAlertaClimatica(AlertaClimaticaObserver alertaClimaticaObserver){
    observersAlerta.add(alertaClimaticaObserver);
  }

  public void desactivarAlertaClimatica(AlertaClimaticaObserver alertaClimaticaObserver) {
    observersAlerta.remove(alertaClimaticaObserver);
  }

  public List<String> getAlertasPublicadas() {
    return alertasPublicadas;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public String mailUsuario() {
    return usuario.getEmail();
  }

  public boolean tiene(String alerta) {
    return alertasPublicadas.contains(alerta);
  }
}
