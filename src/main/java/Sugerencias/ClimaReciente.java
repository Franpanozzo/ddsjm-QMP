package Sugerencias;

import java.util.List;
import java.util.Map;

public interface ClimaReciente {


  public abstract void setearClimaBSAS();

  public abstract Integer getTemperatura();

  public abstract ClimaReciente clone();
}
