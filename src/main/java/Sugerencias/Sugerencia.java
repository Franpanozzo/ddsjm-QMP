package Sugerencias;

import ClimaActual.ClimaReciente;
import ClimaActual.ClimaRecienteAccu;
import domain.prendas.Prenda;

import java.util.List;

public class Sugerencia {

  private static ClimaReciente climaReciente = new ClimaRecienteAccu();

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

  //new sugerenciaInvierno
  //Sugerencia.devolverrSeguncCLIma(sugerenciaInvierno)


  public static Sugerencia devolverSugerenciaAlClima(FabricaDeSugerencias sugerenciaProp) {

    sugerenciaProp.climaActual(climaReciente);
    return new Sugerencia(
        sugerenciaProp.sugerirParteSup(),
        sugerenciaProp.sugerirParteInf(),
        sugerenciaProp.sugerirCalzado(),
        sugerenciaProp.sugerirAccesorio()
    );
  }

  public static List<String> getAlertas() {
    return climaReciente.getAlertas();
  }

}

//Sugerencia clase padre le pasas a la subclase el clima clonado