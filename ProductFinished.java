public class ProductFinished implements State{
  Machine machine;
  Galleneitor500 galleneitor;
  Wonka3000 wonka;

  public ProductFinished(Machine machine){
    this.machine = machine;
  }
  public void turningOn(){
    System.out.println("Ya esta encendida la máquina");
  }
  public void turningOff(){
    System.out.println("No se puede apagar la maquina");
  }
  public void chooseProduct(int typeProduct, int numberProduct){
    System.out.println("Ya se ha elegido el producto");
  }

  public void suspend(){
    System.out.println("No se puede suspender la maquina");
  }
  public void packProduct(int typeProduct){
    System.out.println("Se ha terminado de cocinar y ahora se empaquetará el producto");
    if(typeProduct<7){
        wonka = new WonkaToGalleneitorAdapter(machine.getDulcesRosa());
        wonka.pack();
    }else if(typeProduct>6){
      IGalleneitor galleneitorAdapter = new WonkaToGalleneitorAdapter(machine.getDulcesRosa());
      galleneitorAdapter.packCookie();
    }
    machine.setState(machine.getEnd());
  }
}
