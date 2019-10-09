public class ProxyBranch implements IBranch{
  NorthBranch northBranch;
  EastBranch eastBranch;
  SouthBranch southBranch;

  public ProxyBranch(NorthBranch northBranch, EastBranch eastBranch, SouthBranch southBranch){
    this.northBranch = new NorthBranch();
    this.eastBranch = new EastBranch();
    this.southBranch = new SouthBranch();
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
  public void askBatch(int numberProduct, int typeProduct, int branch,TechnicalOfficer technical, Machine machine){
    if(branch == 0){
      northBranch.askBatch(numberProduct,typeProduct,0,technical,machine);
    }else if(branch == 1){
      eastBranch.askBatch(numberProduct,typeProduct,1,technical,machine);
    }else if(branch == 2){
      southBranch.askBatch(numberProduct,typeProduct,2,technical,machine);
    }
  }

}
