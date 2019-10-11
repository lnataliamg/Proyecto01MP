import java.util.*;
import java.util.Iterator;
public class ProxyBranch implements IBranch{
  NorthBranch northBranch;
  EastBranch eastBranch;
  SouthBranch southBranch;

  public ProxyBranch(NorthBranch northBranch, EastBranch eastBranch, SouthBranch southBranch){
    this.northBranch = new NorthBranch();
    this.eastBranch = new EastBranch();
    this.southBranch = new SouthBranch();
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


  @Override
  public String checkInventory(int branch){
    if(branch == 0){
      return northBranch.checkInventory(0);
    }else if(branch == 1){
      return eastBranch.checkInventory(1);
    }else if(branch == 2){
      return southBranch.checkInventory(2);
    }
    return null;
  }
  @Override
  public Batch askBatch(int numberProduct, int typeProduct, int branch,TechnicalOfficer technical){
    if(branch == 0){
      return northBranch.askBatch(numberProduct,typeProduct,0,technical);
    }else if(branch == 1){
      return eastBranch.askBatch(numberProduct,typeProduct,1,technical);
    }else if(branch == 2){
      return southBranch.askBatch(numberProduct,typeProduct,2,technical);
    }else{
      return null;
    }
  }
  @Override
  public Iterator getInventoryIterator(int branch){
    if(branch == 0){
      System.out.println("Se creo el iterador");
      return northBranch.getInventoryIterator(0);
    }else if(branch == 1){
      return eastBranch.getInventoryIterator(1);
    }else if(branch == 2){
      return southBranch.getInventoryIterator(2);
    }else{
      return null;
    }
  }




}
