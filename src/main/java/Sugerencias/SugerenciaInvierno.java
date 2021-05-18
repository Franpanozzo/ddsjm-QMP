package Sugerencias;

import ClimaActual.ClimaReciente;
import domain.prendas.*;

public class SugerenciaInvierno implements FabricaDeSugerencias {
  private prendaBuilder borrador;
  ClimaReciente climaReciente;

  public SugerenciaInvierno() {
    /*
    //Aca cargo en las listas todas las prendas de invierno;
    partesSuperiores.add(this.parte)
    */
  }

  @Override
  public void climaActual(ClimaReciente climaReciente) {
    this.climaReciente = climaReciente;
  }

  @Override
  public Prenda sugerirParteSup() {
    borrador = new prendaBuilder(TipoPrenda.REMERA);
    borrador.setColor(new Color(3,2,1));
    borrador.setMaterial(Material.ALGODON);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda sugerirParteInf() {
    borrador = new prendaBuilder(TipoPrenda.PANTALON);
    borrador.setColor(new Color(3,2,1));
    borrador.setMaterial(Material.CUERO);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda sugerirCalzado() {
    borrador = new prendaBuilder(TipoPrenda.ZAPATILLA);
    borrador.setColor(new Color(3,2,1));
    borrador.setMaterial(Material.CUERO);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda sugerirAccesorio() {
    borrador = new prendaBuilder(TipoPrenda.GORRO);
    borrador.setColor(new Color(3,2,1));
    borrador.setMaterial(Material.ALGODON);
    return borrador.crearPrenda();
  }
}
