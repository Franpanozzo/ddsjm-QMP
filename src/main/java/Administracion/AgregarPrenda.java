package Administracion;

import Guardarropas.Guardarropa;
import domain.prendas.Prenda;

public class AgregarPrenda extends PropuestaDeModif{

  public AgregarPrenda(Guardarropa guardarropaAModif, Prenda prenda) {
    super(guardarropaAModif, prenda);
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
