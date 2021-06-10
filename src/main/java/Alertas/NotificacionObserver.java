package Alertas;

import Administracion.Usuario;
import Notification.NotificationService;

import java.util.List;

public class NotificacionObserver implements AlertaClimaticaObserver{
  String tipoDeNoti;
  String mensaje;

  public NotificacionObserver(String tipoDeNoti, String mensaje) {
    this.tipoDeNoti = tipoDeNoti;
    this.mensaje = mensaje;
  }

  public void recibirAlertas(Usuario usuario, List<String> alertasPublicadas) {
    if(this.tieneNoti(alertasPublicadas))
      NotificationService.notify(mensaje);
  }

  private boolean tieneNoti(List<String> alertasPublicadas) {
    return alertasPublicadas.contains(mensaje);
  }
}
