package Alertas;

import Mail.MailSender;

public class MailObserver implements AlertaClimaticaObserver{
  MailSender mailSender;

  public void recibirAlertas(Alertas alertas) {
    mailSender.send(alertas.mailUsuario(),"Se generaron las siguientes alertas meteorologicas: " +
        alertas.getAlertasPublicadas());
  }
}
