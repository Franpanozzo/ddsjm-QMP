package ClimaActual;

import java.util.List;
import java.util.Map;

public class ClimaRecienteAccu implements ClimaReciente{

  AccuWeatherAPI apiClima;
  List<Map<String, Object>> condicionesClimaticas;

  public ClimaRecienteAccu() {
    apiClima = new AccuWeatherAPI();
    this.setearClimaBSAS();
    this.actualizarClimaCada12();
  }

  private void actualizarClimaCada12() {
    //TODO Algoritmo para que ejecute cada 12 horas y se actualize el clima
    apiClima = new AccuWeatherAPI();
    this.setearClimaBSAS();
  }

  public void setearClimaBSAS() {
    condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
  }

  public Integer getTemperatura() {
    //Temperatura devuelve un hashMap pero despues como agarro el numero de la temperatura??
    return (Integer) condicionesClimaticas.get(0).get("Temperature");
  }

  public List<String> getAlertas() {
    Map<String, Object> alertas = apiClima.getAlertas("Buenos Aires");
    return (List<String>) alertas.get("CurrentAlerts");
  }

}
