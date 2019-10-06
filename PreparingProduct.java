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
  public void chooseProduct(){
    System.out.println("Eligiendo producto que preparar");
    System.out.println("¿Qué deseas preparar?");
    System.out.println("1. Dulces");
    System.out.println("2. Galletas");
    System.out.println("0. Exit");
    int answer = sc.nextInt();
    if(answer==1){
      wonka = new Wonka3000(machine.getDulcesRosa());
      if(wonka.prepararDulce()){
        machine.setState(machine.getProductFinished());
      }else{
        machine.setState(machine.getValidator());
      }
    }else if(answer == 2){
      galleneitor = new Galleneitor500(machine.getDulcesRosa());
      if(galleneitor.prepareCookie()){
        machine.setState(machine.getProductFinished());
      }else{
        machine.setState(machine.getValidator());
      }
    }else if(answer == 0){
      System.exit(0);
    }else{
      System.out.println("Opción incorrecta");
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
