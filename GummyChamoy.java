public class GummyChamoy extends Gummy{
  public GummyChamoy(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }

  @Override
  public String getNameGummy(){
    return "Frutas con chamoy 150gr";
  }
  @Override
  public void chooseGummyMold(){
    System.out.println("Eligiendo moldes en forma de frutitas");
  }

  @Override
  public void prepareGrenetina(int n){
    System.out.println("Hirviendo el agua");
    System.out.println("Agregando la grenetina");
    System.out.println("Mezclando grenetina y agua");
    System.out.println("Agregando la miel de maíz");
    System.out.println("Mezclando a 60,6°C");
    dulcesRosa.setWater(dulcesRosa.getWater()-(float)(0.040*n));
    dulcesRosa.setGrenetina(dulcesRosa.getGrenetina()-(float)(0.050)*n );
    dulcesRosa.setHoney(dulcesRosa.getHoney() - (float)(0.040*n));
  }

  @Override
  public void addingFlavoring(int n){
    System.out.println("Agregando chamoy a las gomitas");
    dulcesRosa.setChamoy(dulcesRosa.getChamoy()-(float)(0.030 * n));
  }
  public Boolean validate(int n){
    if(dulcesRosa.getWater() >= (.04*n) && dulcesRosa.getGrenetina() >= (.050*n) && dulcesRosa.getHoney() >= (.040*n) && dulcesRosa.getChamoy() >= (.030*n)){
      return true;
    }
    return false;

  }
}
