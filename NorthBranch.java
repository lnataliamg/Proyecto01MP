import java.util.*;
import java.util.Iterator;

public class NorthBranch implements IBranch{
  ArrayList batch;
  public NorthBranch(){
    batch = new ArrayList<Batch>();
  }
  @Override
  public void addBatch(int numberProduct, int typeProduct){
    
  }
  @Override
  public Iterator createIterator(){
    return new IteratorNorthBranch(batch);
  }
  @Override
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
}
