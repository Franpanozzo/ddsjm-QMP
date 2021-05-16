package Sugerencias;

public class Sugerencia {

  ClimaReciente climaReciente;

  public Sugerencia() {
    climaReciente = new ClimaRecienteAccu();
  }

  public void actualizarClima() {
  climaReciente.setearClimaBSAS();
  }

  public Integer getTemperatura() {
    return climaReciente.getTemperatura();
  }
}
