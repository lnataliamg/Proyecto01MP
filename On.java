import java.util.Scanner;
public class On implements State{
  Scanner sc = new Scanner(System.in);
  Machine machine;
  Wonka3000 wonka;
  Galleneitor500 galleneitor;

  public On(Machine machine){
    this.machine = machine;
  }

  public void turningOn(){
    System.out.println("Ya está encendida");
  }
  public void turningOff(){
    System.out.println("Se apagará la máquina");
    machine.setState(machine.getOff());

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
  public void packProduct(int typeProduct){
    System.out.println("Aun no se ha cocinado un producto");
  }
}
