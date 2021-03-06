package Administracion;

import Alertas.Alertas;
import Guardarropas.Guardarropa;
import Propuestas.AgregarPrenda;
import Propuestas.PropuestaDeModif;
import Propuestas.QuitarPrenda;
import Sugerencias.Sugerencia;
import domain.prendas.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<PropuestaDeModif> propuestasPendientes = new ArrayList<>();
  HistorialDeModifs historial;
  List<Guardarropa> guardarropasPersonales = new ArrayList<>();
  Sugerencia sugerenciaDiaria;
  Alertas alertas;
  String email;
  String ciudadResidencia;

  public String ciudadResidencia() {
    return ciudadResidencia;
  }

  public void actualizarSugerencia() {
    sugerenciaDiaria = Sugerencia.devolverSugerenciaAlClima(this.guardarropaAleatorio());
  }

  //Podria ser en un futuro que el usuario elija de que guardarropa quiera que le sugieran
  public Guardarropa guardarropaAleatorio() {
    return guardarropasPersonales.get(0);
  }

  public void actualizarAlertas() {
    alertas.actualizarAlertas(this);
  }


  public void agregarPropuesta(PropuestaDeModif propuestaDeModif) {
    propuestasPendientes.add(propuestaDeModif);
  }

  public List<PropuestaDeModif> verPropuestas() {
    return propuestasPendientes;
  }

  public void crearGuardarropaParaAmbosUsuarios(Usuario usuario) {
    Guardarropa guardarropa = new Guardarropa();
    this.agregarGuardarropa(guardarropa);
    usuario.agregarGuardarropa(guardarropa);
  }

  private void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropasPersonales.add(guardarropa);
  }

  //Suponemos que el usuario ya sabe la supuesta propuesta, que esa parte de buscar la propuesta que
  //quiera aceptar es parte de una abstraccion anterior
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

  public String getEmail() {
    return email;
  }

}
