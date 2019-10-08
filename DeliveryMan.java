public class DeliveryMan{
  private static long idStarter = 0;
  private String id;
  private String rfc;
  private String name;
  private int branch;

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
		return int;
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

  public static synchronized String createID(){
    return String.valueOf(idStarter++);
  }
}
