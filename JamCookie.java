public class JamCookie extends Cookie{
  public JamCookie(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }

  @Override
  public String getNameCookie(){
    return "Galletas rellenas de mermelada";
  }
  @Override
  public void mixingEggs(int n){
    System.out.println("Agregando huevos a contenedor");
    System.out.println("Batiendo huevos en batidora");
    System.out.println("Agregando azucar a huevos");
    System.out.println("Batiendo huevos con azucar");
    dulcesRosa.setEgg(dulcesRosa.getEgg()- (float)(.10*n));
    dulcesRosa.setSugar(dulcesRosa.getSugar()- (float)(.250*n));
  }
  @Override
  public void mixingIngredients(int n){
    System.out.println("Agregando de harina al contenedor con los huevos batidos");
    dulcesRosa.setFlour(dulcesRosa.getFlour()- (float)(.6*n));

    prepareJamCookies(n);
  }

  public void prepareJamCookies(int n){
    System.out.println("Rellenando galletas con mermelada");
    dulcesRosa.setJam(dulcesRosa.getJam()- (float)(.080*n));
  }

  public Boolean validate(int n){
    if(dulcesRosa.getEgg() >= (.10*n) && dulcesRosa.getSugar() >= (.250*n) && dulcesRosa.getFlour() >= (.6*n) && dulcesRosa.getJam() >= (.080*n)){
      return true;
    }
    return false;

  }
}
