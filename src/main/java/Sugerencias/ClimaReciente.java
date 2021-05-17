package Sugerencias;

import java.util.List;
import java.util.Map;

public interface ClimaReciente {


  public abstract void setearClimaBSAS();

  public abstract Integer getTemperatura();

  //Aplico patron protoype para poder clonar y no llamar muchasveces a Accu y nos cobren
  public abstract ClimaReciente clone();
}
