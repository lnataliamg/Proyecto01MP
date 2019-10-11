public class DeliveryMan{
  private static long idStarter = 0;
  private String id;
  private String rfc;
  private String name;
  private int branch;
  private Batch batch;

	/**
	* Default empty DeliveryMan constructor
	*/
	public DeliveryMan() {
		super();
	}

	/**
	* Default DeliveryMan constructor
	*/
	public DeliveryMan(String rfc, String name) {
		super();
		this.rfc = rfc;
		this.name = name;
	}



	/**
	* Returns value of id
	* @return
	*/
	public String getId() {
		return id;
	}

  public int getBranch() {
		return branch;
	}

  public void setBranch(int branch){
    this.branch = branch;
  }

	/**
	* Sets new value of id
	* @param
	*/
	public void setId() {
		this.id = createID();
	}

	/**
	* Returns value of rfc
	* @return
	*/
	public String getRfc() {
		return rfc;
	}

	/**
	* Sets new value of rfc
	* @param
	*/
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

  public void setBatch(Batch batch){
    this.batch = batch;
  }
  public Batch getBatch(){
    return batch;
  }
  public static synchronized String createID(){
    return String.valueOf(idStarter++);
  }


  public void deliverBatch(int branch, NorthBranch northBranch, EastBranch eastBranch, SouthBranch southBranch){
    if(batch != null){
      if(branch == 0){
        System.out.println(getName()+ " esta llevando el lote a la sucursal norte");
        northBranch.addBatch(getBatch());
      }else if(branch == 1){
        System.out.println(getName()+ " esta llevando el lote a la sucursal este");
        eastBranch.addBatch(getBatch());
      }else if(branch == 2){
        System.out.println(getName()+ " esta llevando el lote a la sucursal sur");
        southBranch.addBatch(getBatch());
      }
      System.out.println("Lote llevado con éxito, ahora la socursal lo tiene en su inventario");
    }else{
      System.out.println("El repartidor no enviará ningún pedido");
    }
  }
}
