package Sugerencias;

import ClimaActual.ClimaReciente;
import domain.prendas.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface FabricaDeSugerencias {

  /* TODDO LO QUE ESTA COMENTADO ES SI FUERA UNA CLASE ABSTRACTA
  List<Prenda> partesSuperiores = new ArrayList<>();
  List<Prenda> partesInferiores= new ArrayList<>();
  List<Prenda> calzados = new ArrayList<>();
  List<Prenda> accesorios = new ArrayList<>();
  ClimaReciente climaReciente;

  public SugerenciaPropuesta() {
  }
   */

  public void climaActual(ClimaReciente climaReciente);

  /*
  public void climaActual(ClimaReciente climaReciente){
    this.climaReciente = climaReciente;
    this.filtrarSegunTemperatura();
  }*/
 /*
  private void filtrarSegunTemperatura(){
    partesInferiores = partesInferiores.stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).collect(Collectors.toList());
    partesSuperiores = partesSuperiores.stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).collect(Collectors.toList());
    calzados = partesInferiores.stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).collect(Collectors.toList());
    accesorios = partesInferiores.stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).collect(Collectors.toList());

  }*/

  public Prenda sugerirParteSup();

  public Prenda sugerirParteInf();

  public Prenda sugerirCalzado();

  public Prenda sugerirAccesorio();


}
