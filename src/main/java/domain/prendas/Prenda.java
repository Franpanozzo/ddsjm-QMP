package domain.prendas;

public class Prenda{
  private Enum<TipoPrenda> tipoPrenda;
  private Color color;
  private Enum<Material> material;
  private Color colorSecundario;
  private Enum<Trama> tipoTela = Trama.LISA;

  /* public Prenda(Enum<TipoPrenda> tipoPrenda, Color color, Enum<Material> material){
    this.tipoPrenda = tipoPrenda;
    this.color = color;
    this.material = material;
  }

  public Prenda(Enum<TipoPrenda> tipoPrenda, Color color, Enum<Material> material, Color colorSecundario){
    this.tipoPrenda = tipoPrenda;
    this.color = color;
    this.material = material;
    this.colorSecundario = colorSecundario;
  }  */

  public Prenda(Enum<TipoPrenda> tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void indicarAspectos(Color color, Color colorSecundario, Material material) {
    this.color = color;
    tipoPrenda.materialPosible(material);
    this.material = material;
  }

  //Otro consturctor con la trama opcional

  //Meteodo prototype que devuelva una copia
}