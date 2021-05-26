package Sugerencias;

import ClimaActual.ClimaReciente;
import domain.prendas.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class FabricaDeSugerencias {

  List<Prenda> partesSuperiores = new ArrayList<>();
  List<Prenda> partesInferiores= new ArrayList<>();
  List<Prenda> calzados = new ArrayList<>();
  List<Prenda> accesorios = new ArrayList<>();
  ClimaReciente climaReciente;

  public void climaActual(ClimaReciente climaReciente){
    this.climaReciente = climaReciente;
  }

  public Prenda sugerirParteSup(){
    this.agregarPartesSuperiores();
    return partesInferiores.stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).findAny().get();
  }

  protected abstract void agregarPartesSuperiores();

  public Prenda sugerirParteInf(){
    this.agregarPartesInferiores();
    return partesInferiores.stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).findAny().get();
  }

  protected abstract void agregarPartesInferiores();

  public Prenda sugerirCalzado(){
    this.agregarCalzados();
    return calzados.stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).findAny().get();
  }

  protected abstract void agregarCalzados();

  public Prenda sugerirAccesorio(){
    this.agregarAccesorios();
   return accesorios.stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).findAny().get();
  }

  protected abstract void agregarAccesorios();

}
