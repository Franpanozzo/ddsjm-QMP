package Propuestas;

import Guardarropas.Guardarropa;
import domain.prendas.Prenda;

public class QuitarPrenda implements PropuestaDeModif{
  Guardarropa guardarropaAModif;
  Prenda prenda;

  public QuitarPrenda(Guardarropa guardarropaAModif, Prenda prenda) {
    this.guardarropaAModif = guardarropaAModif;
    this.prenda = prenda;
  }

  @Override
  public void modificarGuardarropa() {
    guardarropaAModif.descolgarPrenda(prenda);
  }

  @Override
  public void deshacerModif() {
    guardarropaAModif.colgarPrenda(prenda);
  }
}
