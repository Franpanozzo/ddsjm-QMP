package domain.prendas;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

//@SuppressWarnings("checkstyle:MissingJavadocType")
public enum TipoPrenda {
  REMERA {
    //Cada tipo tiene una lista de que materiales se les permite
    public Enum<Categoria> getCategoria() {
      return Categoria.PARTESUP;
    }

    public List<Enum<Material>> materialesPermitidos() {
      return Arrays.asList(Material.ALGODON,Material.JEAN);
    }
  },
  PANTALON {
    public Enum<Categoria> getCategoria() {
      return Categoria.PARTEINF;
    }

    public List<Enum<Material>> materialesPermitidos() {
      return Arrays.asList(Material.CUERO,Material.JEAN);
    }
  },
  ZAPATILLA {
    public Enum<Categoria> getCategoria() {
      return Categoria.CALZADO;
    }

    public List<Enum<Material>> materialesPermitidos() {
      return Arrays.asList(Material.CUERO);
    }
  };

  //Cad una implementa un metodo abstracto que me devuelv la categoria
  public abstract Enum<Categoria> getCategoria();

  public void materialPosible(Enum<Material> material) {
      if(!this.esPosibleMaterial(material)) throw new RuntimeException();
  }

  protected boolean esPosibleMaterial(Enum<Material> material) {
    return this.materialesPermitidos().contains(material);
  }

  protected abstract List<Enum<Material>> materialesPermitidos();

  // public abstract boolean tipoPermite(Enum<Material> material);
}

