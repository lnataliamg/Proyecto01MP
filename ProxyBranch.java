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
  public Batch askBatch(int numberProduct, int typeProduct, int branch,TechnicalOfficer technical, Machine machine){
    if(branch == 0){
      return northBranch.askBatch(numberProduct,typeProduct,0,technical,machine);
    }else if(branch == 1){
      return eastBranch.askBatch(numberProduct,typeProduct,1,technical,machine);
    }else if(branch == 2){
      return southBranch.askBatch(numberProduct,typeProduct,2,technical,machine);
    }else{
      return null;
    }
  }
  public static void main(String[] args) {
    NorthBranch nb = new NorthBranch();
    EastBranch eb = new EastBranch();
    SouthBranch sb = new SouthBranch();
    IBranch proxy = new ProxyBranch(nb,eb,sb);
    Batch batch = new Batch(1,1);
    Batch batch1 = new Batch(1,2);
    nb.addBatch(batch);
    nb.addBatch(batch1);
    System.out.println((nb.checkInventory(0)));
  }

}
