public class End implements State{
  Machine machine;

  public End(Machine machine){
    this.machine = machine;
  }
  public void turningOn(){
    System.out.println("Reiniciando maquina");
    machine.setState(machine.getOn());
  }
  public void turningOff(){
    System.out.println("Apagando la maquina");
    machine.setState(machine.getOff());
  }
  public void chooseProduct(int typeProduct, int numberProduct){
    System.out.println("Reiniciando maquina");
    machine.setState(machine.getOn());
  }
  public void suspend(){
    System.out.println("Suspendiendo la maquina");
    machine.setState(machine.getSuspended());
  }
  public void packProduct(){
    System.out.println("No se ha preparado nada");
  }
}
