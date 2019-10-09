import java.util.Scanner;
import java.util.Iterator;
public class TechnicalOfficer{
  NorthBranch northBranch;
  EastBranch eastBranch;
  SouthBranch southBranch;
  Machine machine;
  public TechnicalOfficer(NorthBranch northBranch, EastBranch eastBranch, SouthBranch southBranch){
    this.northBranch = new NorthBranch();
    this.eastBranch = new EastBranch();
    this.southBranch = new SouthBranch();
  }

  public void setNorthBranch(NorthBranch northBranch){
    this.northBranch = northBranch;
  }
  public void setEastBranch(EastBranch eastBranch){
    this.eastBranch = eastBranch;
  }
  public void setSouthBranch(SouthBranch southBranch){
    this.southBranch = southBranch;
  }

  public boolean validateBatchOrder(int typeProduct, int numberProduct, int branch ){
    boolean validate= true;
    if(branch == 0){
      Iterator iterator = northBranch.createIterator();
      while(iterator.hasNext()){
        Batch batch = (Batch) iterator.next();
        if(batch.getTypeProduct() == typeProduct || batch.getNumberProduct() == 0){
          validate = false;
        }
      }
    }else if(branch == 1){
      Iterator iterator = eastBranch.createIterator();
      while(iterator.hasNext()){
        Batch batch = (Batch) iterator.next();
        if(batch.getTypeProduct() == typeProduct || batch.getNumberProduct() == 0){
          validate = false;
        }
      }
    }else if(branch == 2){
      Iterator iterator = southBranch.createIterator();
      while(iterator.hasNext()){
        Batch batch = (Batch) iterator.next();
        if(batch.getTypeProduct() == typeProduct || batch.getNumberProduct() == 0){
          validate = false;
        }
      }
    }
    return validate;
  }

  public Batch startMachines(Machine machine, int typeProduct, int numberProduct){
    System.out.println("El técnico está encendiendo las máquinas para preparar el lote. Recuerda que tú controlas el proceso de la máquina");
    Scanner sc = new Scanner(System.in);
        State off = new Off(machine);
        machine.setState(off);
        int opcion;
       do {
         System.out.println("0. Enciende las maquinas");
         System.out.println("1. Apaga las maquinas");
         System.out.println("2. Suspendete");
         System.out.println("3. Prepara el producto");
         System.out.println("4. Empaqueta");
         System.out.println("5. Exit");
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
            machine.chooseProduct(typeProduct, numberProduct);
            break;
            case 4:
            machine.packProduct();
            break;
            case 5:
            System.exit(1);


            }
       } while (opcion != 7);
       Batch batch = new Batch(numberProduct, typeProduct);
       return batch;
  }

  public String getInventory(){
    IBranch server = new ProxyBranch(northBranch, eastBranch, southBranch);
    String inventory = "";
    inventory+= "Inventario Sucurs Norte\n" + server.checkInventory(0);
    inventory+= "Inventario Sucursal Este\n" + server.checkInventory(1);
    inventory+= "Inventario Sucursal Sur\n" + server.checkInventory(2);
    return inventory;

  }



}
