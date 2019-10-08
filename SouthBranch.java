import java.util.LinkedList;
import java.util.Iterator;

public class SouthBranch implements IBranch{
  LinkedList batch;
  public SouthBranch(){
    batch = new LinkedList<Batch>();
  }
  @Override
  public void addBatch(int numberProduct, int typeProduct){

  }
  @Override
  public Iterator createIterator(){
    Iterator southIterator = batch.iterator();
    return southIterator;
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
