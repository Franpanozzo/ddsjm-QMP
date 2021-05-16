package domain.prendas;


public class Prenda {
  private Enum<TipoPrenda> tipoPrenda;
  private Color color;
  private Enum<Material> material;
  private Color colorSecundario;
  private Enum<Trama> trama;

  public Prenda(Enum<TipoPrenda> tipoPrenda, Enum<Material> material, Color color,Enum<Trama> trama) {
    this.tipoPrenda = tipoPrenda;
    this.color = color;
    this.material = material;
    this.trama = trama;
  }

  public Prenda(Enum<TipoPrenda> tipoPrenda,Enum<Material> material, Color color, Color colorSecundario,Enum<Trama> trama) {
    this.tipoPrenda = tipoPrenda;
    this.color = color;
    this.material = material;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

  public Enum<Categoria> getCategoria(){
    return tipoPrenda.getCategoria();
  }

}