import java.util.*;
import java.util.Iterator;
public interface IBranch{

    //proxy
  public String checkInventory(int branch);
  public Batch askBatch(int numberProduct, int typeProduct, int branch,TechnicalOfficer technical);
  public void setNorthBranch(NorthBranch northBranch);
  public void setEastBranch(EastBranch eastBranch);
  public void setSouthBranch(SouthBranch southBranch);
  public Iterator getInventoryIterator(int branch);

}
