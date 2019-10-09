import java.util.Scanner;
public class Main{
  static Scanner sc = new Scanner(System.in);
  NorthBranch northBranch;
  EastBranch eastBranch;
  SouthBranch southBranch;
  TechnicalOfficer technical;

  public void principalMenu(Machine machine){
    northBranch = new NorthBranch();
    eastBranch = new EastBranch();
    southBranch = new SouthBranch();
    IBranch server = new ProxyBranch(northBranch, eastBranch, southBranch);
    technical = new TechnicalOfficer(northBranch, eastBranch, southBranch);
    System.out.println("-----------Menu principal-----------");
    System.out.println("           1. Operaciones jefe tencico");
    System.out.println("           2. Comprar lotes como clientes");
    System.out.println("           3. Operaciones como sucursal");
    System.out.println("           0. Salir");
    System.out.println("Selecciona que quieres operar");
    int opcion = sc.nextInt();
    switch (opcion) {
      case 0:
        System.exit(1);
      case 1:
        System.out.println("------------Operaciones como jefe tecnico-----------");
        System.out.println("            1. Obtener inventario de las sucursales");
        int operacionJefeTecnico = sc.nextInt();
        switch (operacionJefeTecnico) {
          case 1:
          System.out.println(technical.getInventory());
        }
        break;
      case 2:
        System.out.println("-----------Operaciones como cliente-----------");
        System.out.println("¿A que sucursal quieres comprar lotes?");
        System.out.println("           1. Sucursal Dulces Rosa Norte");
        System.out.println("           2. Sucursal Dulces Rosa Sur");
        System.out.println("           3. Sucursal Dulces Rosa Este");
        int whatBranch = sc.nextInt();
        System.out.println("¿Que tipo de lote quieres comprar?");
        System.out.println("           1. Chocolate con Almendras");
        System.out.println("           2. Chocolate de Leche");
        System.out.println("           3. Chocolate Oscuro");
        System.out.println("           4. Ositos Dulces");
        System.out.println("           5. Gusanos Acidos");
        System.out.println("           6. Frutas con Chamoy");
        System.out.println("           7. Galletas Saladas");
        System.out.println("           8. Galletas rellenas de mermelada");
        System.out.println("           9. Galletas con chispas de chocolate");

        System.out.println("¿Cuentos lotes quieres comprar?");
        int manyBatch = sc.nextInt();

        break;
      case 3:
        System.out.println("-----------Operaciones sucursal-----------");
        System.out.println("           1. Sucursal Dulces Rosa Norte");
        System.out.println("           2. Sucursal Dulces Rosa Sur");
        System.out.println("           3. Sucursal Dulces Rosa Este");
        int operationBranch = sc.nextInt();
        switch (operationBranch) {
          case 1:
            System.out.println("--Sucursal Norte--");
            System.out.println("   1. Pedir lote ");
            int operationBatch = sc.nextInt();
            if(operationBatch == 1){
              System.out.println("¿Que tipo de lote quieres comprar?");
              System.out.println("           1. Chocolate con Almendras");
              System.out.println("           2. Chocolate de Leche");
              System.out.println("           3. Chocolate Oscuro");
              System.out.println("           4. Ositos Dulces");
              System.out.println("           5. Gusanos Acidos");
              System.out.println("           6. Frutas con Chamoy");
              System.out.println("           7. Galletas Saladas");
              System.out.println("           8. Galletas rellenas de mermelada");
              System.out.println("           9. Galletas con chispas de chocolate");

              int typeOfBatch = sc.nextInt();
              System.out.println("¿Cuentos lotes quieres comprar?");
              int cantidad = sc.nextInt();
              server.askBatch(cantidad, typeOfBatch, 0, technical, machine);

            }

            break;
          case 2:
            System.out.println("--Sucursal Sur--");
            break;
          case 3:
            System.out.println("--Sucursal Este--");
            break;
          }


      }

  }


  public static void menuMachine(Machine machine){

    State off = new Off(machine);
    machine.setState(off);
    int opcion;
   do {
     System.out.println("0. Enciende las maquinas");
     System.out.println("1. Apaga las maquinas");
     System.out.println("2. Suspendete");

     System.out.println("4. Empaqueta");

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
    Main main = new Main();
    DulcesRosa almacen = new DulcesRosa(50,50,50,50,25,10,20,50,10,20,50, 10, 10, 10, 25);
    Machine machine = new Machine(almacen);
    System.out.println(almacen.toString());
    System.out.println("----Bienvenido a Dulces Rosa-----");
    main.principalMenu(machine);


    //machine.chooseProduct();
  }
}
