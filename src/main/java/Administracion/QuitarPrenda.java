package Administracion;

import Guardarropas.Guardarropa;
import domain.prendas.Prenda;

public class QuitarPrenda extends PropuestaDeModif{


  public QuitarPrenda(Guardarropa guardarropaAModif, Prenda prenda) {
    super(guardarropaAModif, prenda);
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
