public class MilkChocolate extends Chocolate{

  public MilkChocolate(Wonka3000 wonka){
    super(wonka,false,true);
    this.wonka= wonka;
  }

  @Override
  public String getNameChocolate(){
    return "Chocolate de leche";
  }
  @Override
  public void addIngredientsChocolate(int n){
    prepareMilk(n);
    System.out.println("Agregando mezcla de leche y azucar a molde con el cacao y la manteca de cacao");
    wonka.setCocoaButter(wonka.getCocoaButter() - (float)(.02*n));
    wonka.setCocoa(wonka.getCocoa() - (float)(.02*n));

  }

  public void prepareMilk(int n){
    System.out.println("Agregando la leche y el azucar");
    System.out.println("Se mezclan y se concentran para preparar el proceso de la mezcla con la pasta de cacao y el cacao");
    wonka.setMilk(  wonka.getMilk() - (float)(0.015*n));
    wonka.setSugar(wonka.getSugar()- (float)(.013 * n ));
  }



}
