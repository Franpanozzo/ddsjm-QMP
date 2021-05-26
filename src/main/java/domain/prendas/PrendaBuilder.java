package domain.prendas;

public class PrendaBuilder {
  private TipoPrenda tipoPrenda;
  private Color color;
  private Material material;
  private Color colorSecundario;
  private Trama trama = Trama.LISA;

  public PrendaBuilder(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void setMaterial(Material material) {
    if(!tipoPrenda.materialPosible(material)) throw new RuntimeException();
      this.material = material;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTipoTela(Trama trama) {
    this.trama = trama;
  }

  public Prenda crearPrenda() {
    if(colorSecundario == null){
      return new Prenda(tipoPrenda, material, color, trama);
    }
    else return new Prenda(tipoPrenda, material, color, colorSecundario, trama);
  }
}
