package Alertas;

import Administracion.Usuario;
import Notification.NotificationService;

import java.util.List;

public class NotifiacionParaguasObserver implements AlertaClimaticaObserver {

  public void recibirAlertas(Alertas alertas) {
    if(this.hayTormenta(alertas))
      NotificationService.notify("Le recomendamos llevarse un paraguas, va a haber tormenta");
  }

  private boolean hayTormenta(Alertas alertas) {
    return alertas.tiene("STORM");
  }
}
