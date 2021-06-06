package Administracion;

import Propuestas.PropuestaDeModif;

import java.util.ArrayList;
import java.util.List;

public class HistorialDeModifs {
  List<PropuestaDeModif> modifiacionesAplicadas = new ArrayList<>();

  public void nuevaModif(PropuestaDeModif propuesta) {
    modifiacionesAplicadas.add(propuesta);
  }

  public PropuestaDeModif sacarModificacion() {
    return modifiacionesAplicadas.remove(0);
   }
 }
