import java.util.Hashtable;
import java.util.Iterator;

public class EastBranch implements IBranch{
  Hashtable batch;
  public EastBranch(){
    batch = new Hashtable();
  }
  @Override
  public void addBatch(int numberProduct, int typeProduct){

  }
  @Override
  public Iterator createIterator(){
    Iterator eastIterator = batch.values().iterator();
    return eastIterator;
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
