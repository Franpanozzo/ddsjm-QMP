package Alertas;

import Administracion.Usuario;
import Notification.NotificationService;

import java.util.List;

public class NotificacionGranizoObserver implements AlertaClimaticaObserver{

  public void recibirAlertas(Usuario usuario, List<String> alertasPublicadas) {
    if(this.hayGranizo(alertasPublicadas))
      NotificationService.notify("Evite salir del auto o busque un techo, alerta de granizo");
  }

  private boolean hayGranizo(List<String> alertasPublicadas) {
    return alertasPublicadas.contains("HAIL");
  }
}
