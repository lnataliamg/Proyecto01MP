public class MilkChocolate extends Chocolate{

  public MilkChocolate(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }

  @Override
  public String getNameChocolate(){
    return "Chocolate de leche";
  }
  @Override
  public void addIngredientsChocolate(int n){
    prepareMilk(n);
    System.out.println("Agregando mezcla de leche y azucar a molde con el cacao y la manteca de cacao");
    dulcesRosa.setCocoaButter(dulcesRosa.getCocoaButter() - (float)(.02*n));
    dulcesRosa.setCocoa(dulcesRosa.getCocoa() - (float)(.02*n));

  }

  public void prepareMilk(int n){
    System.out.println("Agregando la leche y el azucar");
    System.out.println("Se mezclan y se concentran para preparar el proceso de la mezcla con la pasta de cacao y el cacao");
    dulcesRosa.setMilk(  dulcesRosa.getMilk() - (float)(0.015*n));
    dulcesRosa.setSugar(dulcesRosa.getSugar()- (float)(.013 * n ));
  }

  public Boolean validate(int n){
    if(dulcesRosa.getCocoaButter() >= (.02*n) && dulcesRosa.getCocoa() >= (.02*n) && dulcesRosa.getMilk() >= (.015*n) && dulcesRosa.getSugar() >= (.013*n)){
      return true;
    }
    return false;

  }



}
