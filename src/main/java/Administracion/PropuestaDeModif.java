package Administracion;

import Guardarropas.Guardarropa;
import domain.prendas.Prenda;

public abstract class PropuestaDeModif {
  Guardarropa guardarropaAModif;
  Prenda prenda;

  public PropuestaDeModif(Guardarropa guardarropaAModif, Prenda prenda) {
    this.guardarropaAModif = guardarropaAModif;
    this.prenda = prenda;
  }

  public abstract void modificarGuardarropa();

  public abstract void deshacerModif();

}
