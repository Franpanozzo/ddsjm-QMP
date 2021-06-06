package ClimaActual;

import java.util.List;

public interface ClimaReciente {


  public abstract void setearClimaBSAS();

  public abstract Integer getTemperatura();

  public List<String> getAlertas();

}
