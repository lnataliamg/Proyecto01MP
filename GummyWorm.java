public class GummyWorm extends Gummy{
  public GummyWorm(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }
  @Override
  public String getNameGummy(){
    return "Gusanos acidos 160 gr";
  }
  @Override
  public void chooseGummyMold(){
    System.out.println("Eligiendo moldes en forma de gusanos");
  }

  @Override
  public void prepareGrenetina(int n){
    System.out.println("Hirviendo el agua");
    System.out.println("Agregando la grenetina");
    System.out.println("Mezclando grenetina y agua");
    System.out.println("Agregando la miel de maíz");
    System.out.println("Mezclando a 60,6°C");
    dulcesRosa.setWater(dulcesRosa.getWater()-(float)(0.050*n));
    dulcesRosa.setGrenetina(dulcesRosa.getGrenetina()-(float)(0.060)*n );
    dulcesRosa.setHoney(dulcesRosa.getHoney() - (float)(0.050*n));
  }

  @Override
  public void addingFlavoring(int n){
    System.out.println("Agregando saborizante saborizante acido a gomitas de gusano");
    dulcesRosa.setAcidFlavoring(dulcesRosa.getAcidFlavoring()- (float)(.020*n));
  }

  public Boolean validate(int n){
    if(dulcesRosa.getWater() >= (.05*n) || dulcesRosa.getGrenetina() >= (.060*n) || dulcesRosa.getHoney() >= (.050*n) || dulcesRosa.getAcidFlavoring() >= (.020*n) || dulcesRosa.getWater() == (0) || dulcesRosa.getGrenetina() == (0) || dulcesRosa.getHoney() == (0) || dulcesRosa.getAcidFlavoring() == (0)){
      return true;
    }
    return false;

  }


}
