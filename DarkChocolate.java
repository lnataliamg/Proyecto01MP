public class DarkChocolate extends Chocolate{

  public DarkChocolate(Wonka3000 wonka){
    super(wonka,true,true);
    this.wonka= wonka;
  }
  @Override
  public String getNameChocolate(){
    return "Chocolate oscuro";
  }

  @Override
  public void addIngredientsChocolate(int n){
    System.out.println("Agregando mezcla de leche y azucar a molde con el cacao y la manteca de cacao");
    wonka.setCocoaButter(wonka.getCocoaButter() - (float)(.02*n));
    wonka.setCocoa(wonka.getCocoa() - (float)(.02*n));

  }
}
