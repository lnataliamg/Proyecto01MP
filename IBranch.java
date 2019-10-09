import java.util.*;
import java.util.Iterator;
public interface IBranch{

    //proxy
  public String checkInventory(int branch);
  public void askBatch(int numberProduct, int typeProduct, int branch,TechnicalOfficer technical,Machine machine);

}
