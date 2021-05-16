package Sugerencias;

import java.util.List;
import java.util.Map;

public class ClimaRecienteAccu implements ClimaReciente{

  AccuWeatherAPI apiClima = new AccuWeatherAPI();
  List<Map<String, Object>> condicionesClimaticas;


  public ClimaRecienteAccu(ClimaRecienteAccu climaReciente) {
    this.condicionesClimaticas = climaReciente.condicionesClimaticas;
  }

  public ClimaRecienteAccu() {
    super();
  }

  public void setearClimaBSAS() {
    condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
  }

  public Integer getTemperatura() {
    //Temperatura devuelve un hashMap pero despues como agarro el numero de la temperatura??
    return (Integer) condicionesClimaticas.get(0).get("Temperature");
  }

  public ClimaReciente clone() {
    return new ClimaRecienteAccu(this) {
    };
  }
}
