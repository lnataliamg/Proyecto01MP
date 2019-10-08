public abstract class Product{
  protected DulcesRosa dulcesRosa;

  public Product(){
    super();
  }

  public Product(DulcesRosa dulcesRosa){
    this.dulcesRosa = dulcesRosa;
  }

  public abstract String getNameProduct();

}
