public abstract class Chocolate{
  protected Wonka3000 wonka;
  protected Boolean hasAlmond;
  protected Boolean hasMilk;



	/**
	* Default empty Chocolate constructor
	*/
	public Chocolate() {
		super();
	}

	/**
	* Default Chocolate constructor
	*/
	public Chocolate(Wonka3000 wonka, Boolean hasAlmond, Boolean hasMilk) {
		this.hasAlmond = hasAlmond;
		this.hasMilk = hasMilk;
    this.wonka = wonka;
	}


	/**
	* Returns value of hasAlmond
	* @return if the chocolate has almonds
	*/
	public Boolean getHasAlmond() {
		return hasAlmond;
	}

	/**
	* Sets new value of hasAlmond
	* @param hasAlmond if it has almond
	*/
	public void setHasAlmond(Boolean hasAlmond) {
		this.hasAlmond = hasAlmond;
	}

	/**
	* Returns value of hasMilk
	* @return if the chocolate has milk
	*/
	public Boolean getHasMilk() {
		return hasMilk;
	}

	/**
	* Sets new value of hasMilk
	* @param hasMilk if it has milk
	*/
	public void setHasMilk(Boolean hasMilk) {
		this.hasMilk = hasMilk;
	}

  public abstract String getNameChocolate();

  /**
  * Prepara el Chocolate
  */
  public void prepareChocolateTemplate(int n){
    if(n==1){
      System.out.println("        .....Preparando 1 barra de " + getNameChocolate() + ".....\n");
    }else if (n>1){
      System.out.println("        ....Preparando " + n+ " barras de " + getNameChocolate() + "....\n");
    }else{
      System.out.println("Cantidad inválida.");
    }
    chooseBakingMold();
    prepareCacao();
    addIngredientsChocolate(n);
    refinar();
    conchado();
    coolChocolate();
    putBakingMold();
    System.out.println("Chocolate listo");
  }

  /**
  *Elige el molde para colocar el chocolate
  */
  public void chooseBakingMold(){
    System.out.println("Eligiendo moldes para colocar el chocolate");
  }

  public void prepareCacao(){
    System.out.println("Limpiando el cacao");
    System.out.println("Triturando el cacao ");
    System.out.println("Tostando cacao a 150 grados");
    System.out.println("Moliendo cacao de nuevo");

  }
  public abstract void addIngredientsChocolate(int n);

  public void refinar(){
    System.out.println("Refinando la mezcla");
  }
  public void conchado(){
    System.out.println("Amasando el chocolate");
  }
  public void coolChocolate(){
    System.out.println("Enfriando el chocolate para darle textura y aspecto adecuado");
  }

  public void putBakingMold(){
    System.out.println("Poniendo la mezcla en el molde seleccionado");
  }




}
