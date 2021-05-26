package Administracion;

import Exceptions.GuardarropaCompartidoException;
import Guardarropas.Guardarropa;
import domain.prendas.Prenda;

import java.util.ArrayList;
import java.util.List;

public class AdministradorDePrendas {
  List<PropuestaDeModif> propuestasPendientes = new ArrayList<>();
  HistorialDeModifs historial;
  List<Guardarropa> guardarropasPersonales = new ArrayList<>();

  public void propuestaDeAgregar(Prenda prenda, Guardarropa guardarropa) {
    propuestasPendientes.add(new AgregarPrenda(guardarropa, prenda));
  }

  public void propuestaDeEliminar(Prenda prenda, Guardarropa guardarropa) {
    propuestasPendientes.add(new QuitarPrenda(guardarropa, prenda));
  }

  public List<PropuestaDeModif> verPropuestas() {
    return propuestasPendientes;
  }

  public void crearGuardarropaParaAmbosAdmins(AdministradorDePrendas administradorDePrendas) {
    Guardarropa guardarropa = new Guardarropa();
    this.agregarGuardarropa(guardarropa);
    administradorDePrendas.agregarGuardarropa(guardarropa);
  }

  private void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropasPersonales.add(guardarropa);
  }

  public void aceptarPropuesta(PropuestaDeModif propuesta) {
    propuestasPendientes.remove(propuesta);
    propuesta.modificarGuardarropa();
    historial.nuevaModif(propuesta);
  }

  public void rechazarPropuesta(PropuestaDeModif propuesta) {
    propuestasPendientes.remove(propuesta);
  }

  public void deshacerModificacion() {
    PropuestaDeModif modifABorrar = historial.sacarModificacion();
    modifABorrar.deshacerModif();
  }

}
