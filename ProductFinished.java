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
  public void chooseProduct(){
    System.out.println("Ya se ha elegido el producto");
  }

  public void suspend(){
    System.out.println("No se puede suspender la maquina");
  }
  public void packProduct(){
    System.out.println("Se ha terminado de cocinar y ahora se empaquetará el producto");
    machine.empaquetar();
    machine.setState(machine.getEnd());
  }
}
