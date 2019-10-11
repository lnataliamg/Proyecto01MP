import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
public class TechnicalOfficer{
  NorthBranch northBranch;
  EastBranch eastBranch;
  SouthBranch southBranch;
  ArrayList dealers;

  public TechnicalOfficer(NorthBranch northBranch, EastBranch eastBranch, SouthBranch southBranch){
    this.northBranch = new NorthBranch();
    this.eastBranch = new EastBranch();
    this.southBranch = new SouthBranch();
    dealers = new ArrayList<DeliveryMan>();
  }

  public ArrayList getDealers(){
    return dealers;
  }

  public void addDeliveryMan(DeliveryMan deliveryMan){
    dealers.add(deliveryMan);
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

  public Batch validateBatchOrder(int typeProduct, int numberProduct,int branch, IBranch proxy, Batch batchOrder, Machine machine){
    Batch batchNew = null;
    if(branch == 0){
      Iterator iterator = proxy.getInventoryIterator(0);
      while(iterator.hasNext()){
        Batch batch = (Batch) iterator.next();
        if(batch.getTypeProduct() == typeProduct || batch.getNumberProduct() == 0){
          return batch;
        }
        batchNew =startMachines(machine, batchOrder);
      }
    }else if(branch == 1){
      Iterator iterator = proxy.getInventoryIterator(1);
      while(iterator.hasNext()){
        Batch batch = (Batch) iterator.next();
        if(batch.getTypeProduct() == typeProduct || batch.getNumberProduct() == 0){
          return batch;
        }
        batchNew =startMachines(machine, batchOrder);
      }
    }else if(branch == 2){
      Iterator iterator = proxy.getInventoryIterator(2);
      while(iterator.hasNext()){
        Batch batch = (Batch) iterator.next();
        if(batch.getTypeProduct() == typeProduct || batch.getNumberProduct() == 0){
          return batch;
        }
        batchNew =startMachines(machine, batchOrder);
      }
    }

    return batchNew;

  }

  public Batch startMachines(Machine machine, Batch batchOrder){
    if(batchOrder != null){
      System.out.println("Emachinel técnico está encendiendo las máquinas para preparar el lote. Recuerda que tú controlas el proceso de la máquina");
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
              machine.chooseProduct(batchOrder.getTypeProduct(), batchOrder.getNumberProduct());
              break;
              case 4:
              machine.packProduct();
              break;
              case 5:
              break;
              }
            } while (opcion != 5);
            Batch batch = new Batch(batchOrder.getTypeProduct(), batchOrder.getNumberProduct());
            return batch;
      }
      System.out.println("No hay pedido que preprar");
      return null;
  }

  public String getInventory(IBranch server){
    String inventory = "";
    inventory+= "-Inventario Sucurs Norte-\n" + server.checkInventory(0)+"\n";
    inventory+= "\n-Inventario Sucursal Este-\n" + server.checkInventory(1)+"\n";
    inventory+= "\n-Inventario Sucursal Sur-\n" + server.checkInventory(2)+"\n";
    return inventory;
  }

  public DeliveryMan sortRandomBatch( Batch batch){
    Random randomGenerator = new Random();
    int index = randomGenerator.nextInt(dealers.size());
    DeliveryMan dealer = ((DeliveryMan) dealers.get(index));
    dealer.setBatch(batch);
    this.dealers.set(index,dealer);
    return(dealer);
  }

  public String toStringDealers(){
    String personal = "Los repartidores son: \n";
    for (int i = 0; i< dealers.size() ; i++) {
    personal += ((DeliveryMan)dealers.get(i)).getId() + " " + ((DeliveryMan)dealers.get(i)).getName() + " RFC :" + ((DeliveryMan) dealers.get(i)).getRfc() + "\n";
    }
    return personal;
  }





}
