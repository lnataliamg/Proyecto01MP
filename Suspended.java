public class Suspended implements State{
  Machine machine;
  public Suspended(Machine machine){
    this.machine = machine;
  }
  public void turningOn(){
    System.out.println("Reanudando maquina");
    machine.setState(machine.getOn());

  }
  public void turningOff(){
    System.out.println("Apagando maquina");
    machine.setState(machine.getOff());
  }
  public void chooseProduct(int typeProduct, int numberProduct){
    System.out.println("La maquina esta suspendida. No se puede realizar esta actividad");
  }
  public void suspend(){
    System.out.println("La maquina esta suspendida. No se puede realizar esta actividad");
  }
  public void packProduct(){
    System.out.println("La maquina esta suspendida. No se puede realizar esta actividad");
  }
}
