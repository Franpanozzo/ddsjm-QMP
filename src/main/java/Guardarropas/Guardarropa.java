package Guardarropas;

import ClimaActual.ClimaReciente;
import domain.prendas.Categoria;
import domain.prendas.Prenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {
  List<Prenda> prendasColgadas = new ArrayList<>();
  ClimaReciente climaReciente;

  public void climaActual(ClimaReciente climaReciente){
    this.climaReciente = climaReciente;
  }

  public void colgarPrenda(Prenda prenda) {
    prendasColgadas.add(prenda);
  }

  public void descolgarPrenda(Prenda prenda) {
    prendasColgadas.remove(prenda);
  }


  public Prenda sugerirParteSup() {
    return this.partesSuperiores().stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).findAny().get();
  }

  public Prenda sugerirParteInf() {
    return this.partesInferiores().stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).findAny().get();
  }

  public Prenda sugerirCalzado() {
    return this.calzados().stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).findAny().get();
  }

  public Prenda sugerirAccesorio() {
    return this.accesorios().stream().filter(prenda -> prenda.esUsableSegunTemp(climaReciente.getTemperatura())).findAny().get();
  }



  private List<Prenda> partesSuperiores() {
    return prendasColgadas.stream().filter(prenda -> prenda.esCategoria(Categoria.PARTESUP)).collect(Collectors.toList());
  }

  private List<Prenda> partesInferiores() {
    return prendasColgadas.stream().filter(prenda -> prenda.esCategoria(Categoria.PARTEINF)).collect(Collectors.toList());
  }

  private List<Prenda> calzados() {
    return prendasColgadas.stream().filter(prenda -> prenda.esCategoria(Categoria.CALZADO)).collect(Collectors.toList());
  }

  private List<Prenda> accesorios() {
    return prendasColgadas.stream().filter(prenda -> prenda.esCategoria(Categoria.ACCESORIOS)).collect(Collectors.toList());
  }


}



