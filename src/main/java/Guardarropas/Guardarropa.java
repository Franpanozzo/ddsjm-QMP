package Guardarropas;

import domain.prendas.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
  List<Prenda> prendasColgadas = new ArrayList<>();

  public void colgarPrenda(Prenda prenda) {
    prendasColgadas.add(prenda);
  }

  public void descolgarPrenda(Prenda prenda) {
    prendasColgadas.remove(prenda);
  }
}
