package domain.prendas;

public class prendaBuilder {
  private Enum<TipoPrenda> tipoPrenda;
  private Color color;
  private Enum<Material> material;
  private Color colorSecundario;
  private Enum<Trama> trama = Trama.LISA;

  public prendaBuilder(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void setMaterial(Enum<Material> material) {
    if(tipoPrenda.materialPosible(material)) this.material = material;

  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTipoTela(Enum<Trama> trama) {
    this.trama = trama;
  }

  public Prenda crearPrenda() {
    if(color == null){
      return new Prenda(tipoPrenda, material, color, trama);
    }
    else return new Prenda(tipoPrenda, material, color, colorSecundario, trama);
  }
}
