package Sugerencias;

import domain.prendas.Prenda;

public class Sugerencia {

  private static ClimaReciente climaReciente = new ClimaRecienteAccu();;
  private Prenda parteSuperior;
  private Prenda parteInferior;
  private Prenda calzado;
  private Prenda accesorios;

  public Sugerencia(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, Prenda accesorios) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
    this.accesorios = accesorios;
  }

  public Sugerencia() {
  }

  public void actualizarClima() {
    //TODO Algoritmo para que ejecute cada 12 horas
    climaReciente.setearClimaBSAS();
  }

  public static Sugerencia devolverSugerenciaAlClima(SugerenciaPropuesta sugerenciaProp) {
    sugerenciaProp.climaActual(climaReciente.clone());
    return new Sugerencia(
        sugerenciaProp.sugerirParteSup(),
        sugerenciaProp.sugerirParteInf(),
        sugerenciaProp.sugerirCalzado(),
        sugerenciaProp.sugerirAccesorio()
    ) {
    };
  }


}

//Sugerencia clase padre le pasas a la subclase el clima clonado