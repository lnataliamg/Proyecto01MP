public class Batch{
  private DulcesRosa dulcesRosa;
  private int numberProduct;
  private int typeProduct;

	/**
	* Default empty Batch constructor
	*/
	public Batch() {
		super();
	}

	/**
	* Default Batch constructor
  * typeProduct
  * 0 MilkChocolates
  * 1 DarkChocolate
  * 2 AlmondChocolate
  * 3 GummyBear
  * 4 GummyWorm
  * 5 GummyChamoy
  * 6 Crackers
  * 7 ChipCookie
  * 8 JamCookie

	*/
	public Batch(int numberProduct, int typeProduct) {
		super();
		this.numberProduct = numberProduct;
		this.typeProduct = typeProduct;
	}



	/**
	* Returns value of numberProduct
	* @return
	*/
	public int getNumberProduct() {
		return numberProduct;
	}

	/**
	* Sets new value of numberProduct
	* @param
	*/
	public void setNumberProduct(int numberProduct) {
		this.numberProduct = numberProduct;
	}

	/**
	* Returns value of typeProduct
	* @return
	*/
	public int getTypeProduct() {
		return typeProduct;
	}

	/**
	* Sets new value of typeProduct
	* @param
	*/
	public void setTypeProduct(int typeProduct) {
		this.typeProduct = typeProduct;
	}

  public void getProduct(){

  }
}
