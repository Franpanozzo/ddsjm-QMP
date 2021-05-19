package domain.prendas;


public class Prenda {
  private TipoPrenda tipoPrenda;
  private Color color;
  private Material material;
  private Color colorSecundario;
  private Trama trama;

  public Prenda(TipoPrenda tipoPrenda, Material material, Color color, Trama trama) {
    this.tipoPrenda = tipoPrenda;
    this.color = color;
    this.material = material;
    this.trama = trama;
  }

  public Prenda(TipoPrenda tipoPrenda,Material material, Color color, Color colorSecundario, Trama trama) {
    this.tipoPrenda = tipoPrenda;
    this.color = color;
    this.material = material;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

  public Categoria dameCategoria(){
    return tipoPrenda.getCategoria();
  }

  public boolean esUsableSegunTemp(Integer temperatura) {
    return tipoPrenda.estaDentroDeTempAdecuada(temperatura);
  }
}