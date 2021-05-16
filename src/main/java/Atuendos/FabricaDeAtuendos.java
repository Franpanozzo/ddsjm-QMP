package Atuendos;

import domain.prendas.Prenda;

public interface FabricaDeAtuendos {
  //Abstract factory en el que cada institucion tendria su propia fabrica

  public Prenda fabricarParteSup();

  public Prenda fabricarParteInf();

  public Prenda fabricarCalzado();

}
