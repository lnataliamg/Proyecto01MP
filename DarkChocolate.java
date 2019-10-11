public class DarkChocolate extends Chocolate{

  public DarkChocolate(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }
  @Override
  public String getNameChocolate(){
    return "Chocolate oscuro";
  }

  @Override
  public void addIngredientsChocolate(int n){
    System.out.println("Agregando mezcla de leche y azucar a molde con el cacao y la manteca de cacao");
    dulcesRosa.setCocoaButter(dulcesRosa.getCocoaButter() - (float)(.02*n));
    dulcesRosa.setCocoa(dulcesRosa.getCocoa() - (float)(.02*n));

  }

  public Boolean validate(int n){
    if(dulcesRosa.getCocoaButter() < (.02*n) || dulcesRosa.getCocoa() < (.020*n) || dulcesRosa.getCocoaButter() == 0 || dulcesRosa.getCocoa() == (0)) {
      return false;
    }
    return true;

  }
}
