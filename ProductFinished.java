public class ProductFinished implements State{
  Machine machine;

  public ProductFinished(Machine machine){
    this.machine = machine;
  }
  public void turningOn(){
    System.out.println("Ya esta encendida la máquina");
  }
  public void turningOff(){
    System.out.println("No se puede apagar la maquina");
  }
  public void chooseProduct(){
    System.out.println("Ya se ha elegido el producto");
  }
  
  public void suspend(){
    System.out.println("No se puede suspender la maquina");
  }
  public void packProduct(){
    System.out.println("Se ha terminado de cocinar y ahora se empaquetará el producto");
    machine.packProduct();
    machine.setState(machine.getEnd());
  }
}
