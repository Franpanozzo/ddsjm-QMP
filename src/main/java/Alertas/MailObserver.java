package Alertas;

import Administracion.Usuario;
import Mail.MailSender;

import java.util.List;

public class MailObserver implements AlertaClimaticaObserver{
  MailSender mailSender;

  public void recibirAlertas(Usuario usuario, List<String> alertasPublicadas) {
    mailSender.send(usuario.getEmail(),"Se generaron las siguientes alertas meteorologicas: " +
        alertasPublicadas.toString());
  }
}
