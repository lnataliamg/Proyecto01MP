import java.util.Scanner;
public class PreparingProduct implements State{
  Scanner sc = new Scanner(System.in);
  Machine machine;
  Wonka3000 wonka;
  Galleneitor500 galleneitor;

  public PreparingProduct(Machine machine){
    this.machine= machine;
  }
  public void turningOn(){
    System.out.println("Ya esta encendida la máquina");
  }
  public void turningOff(){
    System.out.println("No se puede apagar la maquina");
  }
  public void chooseProduct(int typeProduct, int numberProduct){
    if(typeProduct<7){
      wonka = new Wonka3000(machine.getDulcesRosa());
      if(wonka.prepareCandy(typeProduct,numberProduct)){
        machine.setState(machine.getProductFinished());
      }else{
        machine.setState(machine.getValidator());
      }
    }else if(typeProduct>6){
      galleneitor = new Galleneitor500(machine.getDulcesRosa());
      if(galleneitor.prepareCookie(typeProduct,numberProduct)){
        machine.setState(machine.getProductFinished());
      }else{
        machine.setState(machine.getValidator());
      }
    }
  }

  public void suspend(){
    System.out.println("La máquina se suspenderá");
    machine.setState(machine.getSuspended());
  }
  public void packProduct(){
    System.out.println("Aun no se ha cocinado un producto");

  }

}
