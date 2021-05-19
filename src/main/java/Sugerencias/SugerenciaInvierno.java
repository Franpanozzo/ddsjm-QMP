package Sugerencias;

import ClimaActual.ClimaReciente;
import domain.prendas.*;

public class SugerenciaInvierno extends FabricaDeSugerencias {
  private prendaBuilder borrador;
  ClimaReciente climaReciente;

  public SugerenciaInvierno() {
    /*
    //Aca cargo en las listas todas las prendas de invierno;
    partesSuperiores.addAll(this.parte)
    */
  }

  @Override
  protected void agregarPartesSuperiores() {
    //Agrega cada parte superior que podrian ir con esa sugerencia.
    //Ejemplo
    //partesSuperiores.addAll(new CamperaPolo, new buzoTermico)
  }

  @Override
  protected void agregarPartesInferiores() {
    //partesInferiores.add(new CamperaPolo, new buzoTermico)
  }

  @Override
  protected void agregarCalzados() {
    //callzados.addAll();  }
  }

  @Override
  protected void agregarAccesorios() {
    //accesorios.addAll
  }
}
