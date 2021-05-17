package Sugerencias;

import domain.prendas.Prenda;

public class SugerenciaTemplado implements SugerenciaPropuesta{

  ClimaReciente climaReciente;

  public void climaActual(ClimaReciente climaReciente) {
    this.climaReciente = climaReciente;
  }

  public Prenda sugerirParteSup() {
    return null;
  }

  public Prenda sugerirParteInf() {
    return null;
  }

  public Prenda sugerirCalzado() {
    return null;
  }

  @Override
  public Prenda sugerirAccesorio() {
    return null;
  }
}
