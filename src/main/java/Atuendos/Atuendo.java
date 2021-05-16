package Atuendos;

import domain.prendas.Prenda;

public class Atuendo {

  //Lo interesante esque sean de distinto tipo
  private Prenda parteSuperior;
  private Prenda parteInferior;
  private Prenda calzado;

  public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
  }

  public static Atuendo fabricar(FabricaDeAtuendos fabrica) {
    return new Atuendo(
        fabrica.fabricarParteSup(),
        fabrica.fabricarParteInf(),
        fabrica.fabricarCalzado()
    );
  }



}

