package Atuendos;

import domain.prendas.Prenda;

public class Uniforme {

  //Lo interesante esque sean de distinto tipo
  private Prenda parteSuperior;
  private Prenda parteInferior;
  private Prenda calzado;

  public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
  }

  public static Uniforme fabricar(FabricaDeAtuendos fabrica) {
    return new Uniforme(
        fabrica.fabricarParteSup(),
        fabrica.fabricarParteInf(),
        fabrica.fabricarCalzado()
    );
  }



}

