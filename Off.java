public class Off implements State{
  Machine machine;

  public Off(Machine machine){
    this.machine = machine;
  }
  public void turningOn(){
    System.out.println("Encendiendo maquina");
    machine.setState(machine.getOn());
  }
  public void turningOff(){
    System.out.println("La maquina ya esta apagada");
  }
  public void chooseProduct(int typeProduct, int numberProduct){
    System.out.println("La maquina esta apagada. No se puede realizar esta actividad");
  }
  public void suspend(){
    System.out.println("La maquina esta apagada. No se puede realizar esta actividad");
  }
  public void packProduct(int typeProduct){
    System.out.println("La maquina esta apagada. No se puede realizar esta actividad");
  }
}
