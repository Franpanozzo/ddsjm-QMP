package Propuestas;

import Guardarropas.Guardarropa;
import domain.prendas.Prenda;

public class AgregarPrenda implements PropuestaDeModif {
  Guardarropa guardarropaAModif;
  Prenda prenda;

  public AgregarPrenda(Guardarropa guardarropaAModif, Prenda prenda) {
    this.guardarropaAModif = guardarropaAModif;
    this.prenda = prenda;
  }

  @Override
  public void modificarGuardarropa() {
    guardarropaAModif.colgarPrenda(prenda);
  }

  @Override
  public void deshacerModif() {
    guardarropaAModif.descolgarPrenda(prenda);
  }
}
