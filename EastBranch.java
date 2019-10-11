import java.util.Hashtable;
import java.util.Iterator;

public class EastBranch implements IBranch{
  private static long idStarter = 0;
  Hashtable batch;
  String idEast;
  public EastBranch(){
    batch = new Hashtable();
  }
  public void setNorthBranch(NorthBranch northBranch){}
  public void setEastBranch(EastBranch eastBranch){}
  public void setSouthBranch(SouthBranch southBranch){}

  public void addBatch(Batch newBatch){
    setIdEast();
    batch.put(idEast, newBatch);
  }

  public Iterator createIterator(){
    Iterator eastIterator = batch.values().iterator();
    return eastIterator;
  }
  @Override
  public Iterator getInventoryIterator(int branch){
    return createIterator();
  }

  public void setIdEast() {
		this.idEast = createID();
	}

  public static synchronized String createID(){
    return String.valueOf(idStarter++);
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
  public Batch askBatch(int numberProduct, int typeProduct,int branch,TechnicalOfficer technical){
    Batch batch1 = new Batch(numberProduct, typeProduct);
    technical.setEastBranch(this);
    return batch1;
  }
}
