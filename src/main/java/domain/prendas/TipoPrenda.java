package domain.prendas;

//@SuppressWarnings("checkstyle:MissingJavadocType")
public enum TipoPrenda {
    REMERA {
        //Cada tipo tiene una lista de que materiales se les permite
      public Enum<Categoria> getCategoria() {
      return Categoria.PARTESUP;
     }
     /*public boolean tipoPermite(Enum<Material> material) {
          // TODO
         return true;
     }*/
    },
    PANTALON{
      public Enum<Categoria> getCategoria() {
      return Categoria.PARTEINF;
      }

    },
    ZAPATILLA{
      public Enum<Categoria> getCategoria() {
      return Categoria.CALZADO;
      }
    };
  //Cad una implementa un metodo abstracto que me devuelv la categoria
  public abstract Enum<Categoria> getCategoria();

 /* public void materialPosible(Enum<Material> material) {
      if(!this.tipoPermite(material)) throw new RuntimeException();
  }*/

  // public abstract boolean tipoPermite(Enum<Material> material);
}

