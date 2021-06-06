package Alertas;

import Administracion.Usuario;
import Sugerencias.SugerenciaInvierno;

import java.util.List;

public class SugerenciaDiariaObserver implements AlertaClimaticaObserver {

  public void recibirAlertas(Alertas alertas) {
    //Cambiar para guardarropas
    alertas.getUsuario().actualizarSugerencia(alertas.getUsuario().guardarropaAleatorio());
  }
}
