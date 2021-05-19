package Sugerencias;

import ClimaActual.ClimaReciente;
import ClimaActual.ClimaRecienteAccu;
import domain.prendas.Prenda;

public class Sugerencia {

  //Puede ser que esto este abstraido en un singleton para que cada vez que se haga una sugerencia no se cree
  //un clima Accu que gaste plata
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