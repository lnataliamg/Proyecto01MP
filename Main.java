import java.util.Scanner;
public class Main{
  static Scanner sc = new Scanner(System.in);

  public static void menu(Machine machine){
    State off = new Off(machine);
    machine.setState(off);
    int opcion;
   do {
     System.out.println("0. Enciende las maquinas");
     System.out.println("1. Apaga las maquinas");
     System.out.println("2. Suspendete");
     System.out.println("3. Termina");
     System.out.println("4. Empaqueta");
     System.out.println("5. Valida");
     System.out.println("6. Prepara el producto");
     System.out.println("7. Exit");
     System.out.println("¿Qué opción quieres hacer?");
     opcion = sc.nextInt();
      switch(opcion){
        case 0:
        machine.turningOn();
        break;
        case 1:
        machine.turningOff();
        break;
        case 2:
        machine.suspend();
        break;
        case 3:
        machine.packProduct();
        break;
        case 4:
        machine.packProduct();
        break;
        case 5:

        machine.chooseProduct();
        break;
        case 6:
        machine.chooseProduct();
        break;
        case 7:
        System.exit(1);


        }
   } while (opcion != 7);
  }

  public static void main(String[] args) {

    DulcesRosa almacen = new DulcesRosa(50,50,50,50,25,10,20,50,10,20,50, 10, 10, 10, 25);
    Machine machine = new Machine(almacen);
    System.out.println(almacen.toString());
    menu(machine);
    System.out.println("----Bienvenido a Dulces Rosa-----");

    //machine.chooseProduct();
  }
}
