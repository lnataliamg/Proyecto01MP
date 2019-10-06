public class ChipCookie extends Cookie{
  public ChipCookie(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }

  @Override
  public String getNameCookie(){
    return "Galletas de chispas de chocolate";
  }
  @Override
  public void mixingEggs(int n){
    System.out.println("Agregando huevos a contenedor");
    System.out.println("Batiendo huevos en batidora");
    System.out.println("Agregando azucar a huevos");
    System.out.println("Batiendo huevos con azucar");
    dulcesRosa.setEgg(dulcesRosa.getEgg()- (float)(.13*n));
    dulcesRosa.setSugar(dulcesRosa.getSugar()- (float)(.250*n));
  }
  @Override
  public void mixingIngredients(int n){
    System.out.println("Agregando de harina al contenedor con los huevos batidos");
    dulcesRosa.setFlour(dulcesRosa.getFlour()- (float)(.6*n));
    prepareChipCookies(n);
  }

  public void prepareChipCookies(int n){
    System.out.println("Agregando chispas de chocolate a la mezcla");
    System.out.println("Revolviendo la mezcla");
    dulcesRosa.setChip(dulcesRosa.getChip()- (float)(.10*n));
  }

  public Boolean validate(int n){
    if(dulcesRosa.getEgg() >= (.13*n) && dulcesRosa.getSugar() >= (.250*n) && dulcesRosa.getFlour() >= (.6*n) && dulcesRosa.getChip() >= (.10*n)){
      return true;
    }
    return false;

  }
}
