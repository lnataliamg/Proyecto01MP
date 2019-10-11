import java.util.Scanner;
public class Main{
  static Scanner sc = new Scanner(System.in);
  NorthBranch northBranch;
  EastBranch eastBranch;
  SouthBranch southBranch;
  TechnicalOfficer technical;
  IBranch server;

  public void principalMenu(Machine machine, DulcesRosa dulcesRosa){
    boolean validate = true;
    boolean validate1 = true;
    boolean validate2 = true;
    northBranch = new NorthBranch();
    eastBranch = new EastBranch();
    southBranch = new SouthBranch();
    technical = new TechnicalOfficer(northBranch, eastBranch, southBranch);
    server = new ProxyBranch(northBranch, eastBranch, southBranch);
    DeliveryMan alfonso = new DeliveryMan("123456","Alfonso");
    alfonso.setId();
    DeliveryMan luis = new DeliveryMan("323123", "Luis");
    luis.setId();
    DeliveryMan emiliano = new DeliveryMan("948129", "Emiliano");
    emiliano.setId();
    DeliveryMan adrian = new DeliveryMan("948234","Adrian");
    adrian.setId();
    technical.addDeliveryMan(alfonso);
    technical.addDeliveryMan(luis);
    technical.addDeliveryMan(emiliano);
    technical.addDeliveryMan(adrian);
    int opcion;
    do {
    System.out.println("-----------Menu principal-----------");
    System.out.println("           1. Operaciones jefe tencico");
    System.out.println("           2. Operaciones como sucursal");
    System.out.println("           3. Ver inventario dulces Rosa");
    System.out.println("           0. Salir");
    System.out.println("Selecciona que quieres operar");
    opcion = sc.nextInt();
    switch (opcion) {
      case 0:
        System.exit(1);
      case 1:
        System.out.println("------------Operaciones como jefe tecnico-----------");
        System.out.println("            1. Obtener inventario de las sucursales");
        System.out.println("            2. Ver lista de repartidores");
        int operacionJefeTecnico = sc.nextInt();
        switch (operacionJefeTecnico) {
          case 1:
          System.out.println(technical.getInventory(server));
          break;

          case 2:
          System.out.println("-----------Repartidores-----------");
          System.out.println(technical.toStringDealers());
          System.out.println("----------------------------------");
          break;
        }
        break;
      case 2:
        System.out.println("-----------Operaciones sucursal-----------");
        System.out.println("           1. Sucursal Dulces Rosa Norte");
        System.out.println("           2. Sucursal Dulces Rosa Sur");
        System.out.println("           3. Sucursal Dulces Rosa Este");
        System.out.println("           4. Volver a operaciones");
        int operationBranch = sc.nextInt();
        switch (operationBranch) {
          case 1:
            System.out.println("--Sucursal Norte--");
            System.out.println("   1. Pedir lote ");
            int operationBatch = sc.nextInt();
            if(operationBatch == 1){
              System.out.println("¿Que tipo de lote quieres pedir?");
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

              if(validate == true){
                Batch batch = server.askBatch(cantidad, typeOfBatch, 0, technical);

                technical.startMachines(machine, batch);

                DeliveryMan selectedDelivered = technical.sortRandomBatch(batch);
                selectedDelivered.deliverBatch(0, northBranch, eastBranch, southBranch);
                technical.setNorthBranch(northBranch);
                server.setNorthBranch(northBranch);
                System.out.println(server.checkInventory(0));
                validate = false;
              }else{
                Batch batch = server.askBatch(cantidad, typeOfBatch, 0, technical);
                Batch validateBatch = technical.validateBatchOrder(0, server, batch, machine);
                DeliveryMan selectedDelivered = technical.sortRandomBatch(validateBatch);
                selectedDelivered.deliverBatch(0, northBranch, eastBranch, southBranch);
                technical.setNorthBranch(northBranch);
                server.setNorthBranch(northBranch);
                System.out.println(server.checkInventory(0));
            }


            }

            break;
          case 2:
            System.out.println("--Sucursal Sur--");
            System.out.println("   1. Pedir lote ");
            operationBatch = sc.nextInt();
            if(operationBatch == 1){
              System.out.println("¿Que tipo de lote quieres pedir?");
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
              System.out.println("¿Cuentos lotes quieres pedir?");
              int cantidad = sc.nextInt();
              if(validate1 == true){
                Batch batch = server.askBatch(cantidad, typeOfBatch, 2, technical);
                technical.startMachines(machine, batch);
                DeliveryMan selectedDelivered = technical.sortRandomBatch(batch);
                selectedDelivered.deliverBatch(2, northBranch, eastBranch, southBranch);
                technical.setSouthBranch(southBranch);
                server.setSouthBranch(southBranch);
                System.out.println(server.checkInventory(2));
                validate1 = false;
              }else{
                Batch batch = server.askBatch(cantidad, typeOfBatch, 2, technical);
                Batch validateBatch = technical.validateBatchOrder(2, server, batch, machine);
                DeliveryMan selectedDelivered = technical.sortRandomBatch(validateBatch);
                selectedDelivered.deliverBatch(2, northBranch, eastBranch, southBranch);
                technical.setSouthBranch(southBranch);
                server.setSouthBranch(southBranch);
                System.out.println(server.checkInventory(2));
            }

          }

            break;
          case 3:
            System.out.println("--Sucursal Este--");
            System.out.println("   1. Pedir lote ");
             operationBatch = sc.nextInt();
            if(operationBatch == 1){
              System.out.println("¿Que tipo de lote quieres pedir?");
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
              if(validate2== true){
                Batch batch = server.askBatch(cantidad, typeOfBatch, 2, technical);
                technical.startMachines(machine, batch);
                DeliveryMan selectedDelivered = technical.sortRandomBatch(batch);
                selectedDelivered.deliverBatch(2, northBranch, eastBranch, southBranch);
                technical.setEastBranch(eastBranch);
                server.setEastBranch(eastBranch);
                System.out.println(server.checkInventory(2));
                validate2 = false;
              }else{
                Batch batch = server.askBatch(cantidad, typeOfBatch, 2, technical);
                Batch validateBatch = technical.validateBatchOrder(2, server, batch, machine);
                DeliveryMan selectedDelivered = technical.sortRandomBatch(validateBatch);
                selectedDelivered.deliverBatch(2, northBranch, eastBranch, southBranch);
                technical.setEastBranch(eastBranch);
                server.setEastBranch(eastBranch);
                System.out.println(server.checkInventory(2));
              }
            }

            break;

          case 4:
            break;

          }
          case 3:
          System.out.println(dulcesRosa.toString());
          break;

      }

    } while (opcion !=0);


  }
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println("----Bienvenido a Dulces Rosa-----");
    DulcesRosa almacen = new DulcesRosa(1,1,5,5,2,1,2,5,1,2,1, 1, 1, 1, 2);
    Machine machine = new Machine(almacen);
    System.out.println("--------------------------------------------"+almacen.toString());
    main.principalMenu(machine,almacen);
    System.out.println("--------------------------------------------");
  }
}
