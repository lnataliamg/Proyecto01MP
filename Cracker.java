public class Cracker extends Cookie{
  public Cracker(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }

  @Override
  public String getNameCookie(){
    return "Galletas Saladas";
  }
  @Override
  public void mixingEggs(int n){
    System.out.println("Agregando huevos a contenedor");
    System.out.println("Batiendo huevos en batidora");
    dulcesRosa.setEgg(dulcesRosa.getEgg()- (float)(.13*n));
  }
  @Override
  public void mixingIngredients(int n){
    System.out.println("Agregando de harina al contenedor con los huevos batidos");
    System.out.println("Agregando sal");
    dulcesRosa.setFlour(dulcesRosa.getFlour()- (float)(.5*n));
    dulcesRosa.setSalt(dulcesRosa.getSalt()- (float)(.05*n));
  }

  public Boolean validate(int n){
    if(dulcesRosa.getEgg() < (.13*n) || dulcesRosa.getFlour() < (.5*n) || dulcesRosa.getSalt() < (.05*n) || dulcesRosa.getEgg() == (0) || dulcesRosa.getFlour() == 0 || dulcesRosa.getSalt() == 0 ){
      return false;
    }
    return true;

  }
}
