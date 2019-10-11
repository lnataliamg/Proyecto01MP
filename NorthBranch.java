import java.util.*;
import java.util.Iterator;

public class NorthBranch implements IBranch{
  ArrayList batch;
  public NorthBranch(){
    batch = new ArrayList<Batch>();
  }
  public void setNorthBranch(NorthBranch northBranch){

  }
  public void setEastBranch(EastBranch eastBranch){

  }
  public void setSouthBranch(SouthBranch southBranch){

  }
  public void addBatch(Batch newBatch){
        this.batch.add(newBatch);
  }
  public Iterator createIterator(){
    return new IteratorNorthBranch(this.batch);
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
  public Iterator getInventoryIterator(int branch){
    return createIterator();
  }

  @Override
  public String checkInventory(int branch){

    Iterator iterator = this.createIterator();
    String inventory = "";
    while(iterator.hasNext()){
      Batch newBatch = (Batch)iterator.next();
      if(newBatch.getTypeProduct()== 1) {
          inventory += "\nChocolates de almendras: " + newBatch.getNumberProduct();
        }else if(newBatch.getTypeProduct()== 2){
          inventory+= "\nChocolates de leche: " + newBatch.getNumberProduct();
        }else if(newBatch.getTypeProduct()== 3){
        inventory+= "\nChocolates oscuros: " + newBatch.getNumberProduct();
      }else if(newBatch.getTypeProduct()== 4){
        inventory+= "\nOsitos dulces: " + newBatch.getNumberProduct();
      }else if(newBatch.getTypeProduct()== 5){
          inventory+= "\nGusanos acidos: " + newBatch.getNumberProduct();
        }else if(newBatch.getTypeProduct()== 6){
          inventory+= "\nFrutas con chamoy: " + newBatch.getNumberProduct();
        }else if(newBatch.getTypeProduct()== 7){
          inventory+= "\nGalletas saladas: " + newBatch.getNumberProduct();
        }else if(newBatch.getTypeProduct()== 8){
          inventory+= "\nGalletas rellenas de mermelada: " + newBatch.getNumberProduct();
        }else if(newBatch.getTypeProduct()== 1){
          inventory+= "\nGalletas de chispas de chocolate: " + newBatch.getNumberProduct();
        }
    }
    return inventory;
  }


  @Override
  public Batch askBatch(int numberProduct, int typeProduct,int branch,TechnicalOfficer technical){
    Batch batch1 = new Batch(numberProduct, typeProduct);
    technical.setNorthBranch(this);
    return batch1;
  }
}
