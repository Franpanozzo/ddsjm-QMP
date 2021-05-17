package Sugerencias;

import domain.prendas.Prenda;

public interface SugerenciaPropuesta {

  public void climaActual(ClimaReciente climaReciente);

  public Prenda sugerirParteSup();

  public Prenda sugerirParteInf();

  public Prenda sugerirCalzado();

  public Prenda sugerirAccesorio();


}
