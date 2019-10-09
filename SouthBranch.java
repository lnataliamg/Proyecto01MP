import java.util.LinkedList;
import java.util.Iterator;

public class SouthBranch implements IBranch{
  LinkedList batch;
  public SouthBranch(){
    batch = new LinkedList<Batch>();
  }

  public void addBatch(int numberProduct, int typeProduct, TechnicalOfficer technical){

  }
  public Iterator createIterator(){
    Iterator southIterator = batch.iterator();
    return southIterator;
  }
  public Batch getElement(int index){
    Batch batchSearched = null;
    Iterator iterador = createIterator();
    int i = 1;
    while(iterador.hasNext()){
      Batch batch1 = (Batch)iterador.next();
      if(index == i){
        batchSearched= batch1;
      }
      i++;
    }
    return batchSearched;
  }

  @Override
  public String checkInventory(int branch){
    String inventory = "";
    Iterator iterator = createIterator();
    while(iterator.hasNext()){
      Batch batch = (Batch)iterator.next();
      switch (batch.getTypeProduct()) {
        case 1:
          inventory += "Chocolates de almendras: " + batch.getNumberProduct();
          break;
        case 2:
          inventory+= "Chocolates de leche: " + batch.getNumberProduct();
          break;
        case 3:
          inventory+= "Chocolates oscuros: " + batch.getNumberProduct();
          break;
        case 4:
          inventory+= "Ositos dulces: " + batch.getNumberProduct();
          break;
        case 5:
          inventory+= "Gusanos acidos: " + batch.getNumberProduct();
          break;
        case 6:
          inventory+= "Frutas con chamoy: " + batch.getNumberProduct();
          break;
        case 7:
          inventory+= "Galletas saladas: " + batch.getNumberProduct();
          break;
        case 8:
          inventory+= "Galletas rellenas de mermelada: " + batch.getNumberProduct();
          break;
        case 9:
          inventory+= "Galletas de chispas de chocolate: " + batch.getNumberProduct();
          break;
      }
    }
    return inventory;
  }
  @Override
  public void askBatch(int numberProduct, int typeProduct, int branch, TechnicalOfficer technical,Machine machine){
    technical.setSouthBranch(this);
    boolean validate = technical.validateBatchOrder(numberProduct, typeProduct, 2);
    if(validate){
      technical.startMachines(machine, typeProduct, numberProduct);
    }else{
      System.out.println("Pedido invalido");
    }
  }
}
