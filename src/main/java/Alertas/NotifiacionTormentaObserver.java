package Alertas;

import Administracion.Usuario;
import Notification.NotificationService;

import java.util.List;

public class NotifiacionTormentaObserver implements AlertaClimaticaObserver {

  public void recibirAlertas(Usuario usuario, List<String> alertasPublicadas) {
    if(this.hayTormenta(alertasPublicadas))
      NotificationService.notify("Le recomendamos llevarse un paraguas, va a haber tormenta");
  }

  private boolean hayTormenta(List<String> alertasPublicadas) {
    return alertasPublicadas.contains("STORM");
  }
}
