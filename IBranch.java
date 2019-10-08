import java.util.*;
import java.util.Iterator;
public interface IBranch{

  public void addBatch(int numberProduct, int typeProduct);
  public Iterator createIterator();
  public Batch getElement(int index);
}
