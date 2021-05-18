package domain.prendas;

import java.util.Arrays;
import java.util.List;

//@SuppressWarnings("checkstyle:MissingJavadocType")
public enum TipoPrenda {
  REMERA {
    //Cada tipo tiene una lista de que materiales se les permite
    @Override
    public Categoria getCategoria() {
      return Categoria.PARTESUP;
    }

    public List<Enum<Material>> materialesPermitidos() {
      return Arrays.asList(Material.ALGODON,Material.JEAN);
    }

    @Override
    public Integer tempTopeAdecuada() {
      return 30;
    }
  },
  PANTALON {
    @Override
    public Categoria getCategoria() {
      return Categoria.PARTEINF;
    }

    public List<Enum<Material>> materialesPermitidos() {
      return Arrays.asList(Material.CUERO,Material.JEAN);
    }

    @Override
    public Integer tempTopeAdecuada() {
      return 20;
    }
  },
  ZAPATILLA {
    @Override
    public Categoria getCategoria() {
      return Categoria.CALZADO;
    }

    public List<Enum<Material>> materialesPermitidos() {
      return Arrays.asList(Material.CUERO);
    }

    @Override
    public Integer tempTopeAdecuada() {
      return 27;
    }
  },

  GORRO {
    @Override
    public Categoria getCategoria() {
      return Categoria.ACCESORIOS;
    }

    public List<Enum<Material>> materialesPermitidos() {
      return Arrays.asList(Material.ALGODON);
    }

    @Override
    public Integer tempTopeAdecuada() {
      return 30;
    }
  };

  //Cad una implementa un metodo abstracto que me devuelv la categoria
  public abstract Categoria getCategoria();

  public void materialPosible(Enum<Material> material) {
      if(!this.materialPosibleSegunTipo(material)) throw new RuntimeException();
  }

  public boolean materialPosibleSegunTipo(Enum<Material> material) {
    return this.materialesPermitidos().contains(material);
  }

  protected abstract List<Enum<Material>> materialesPermitidos();

  public abstract Integer tempTopeAdecuada();

  // public abstract boolean tipoPermite(Enum<Material> material);
}

