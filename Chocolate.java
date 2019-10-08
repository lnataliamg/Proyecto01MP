public abstract class Chocolate{
	DulcesRosa dulcesRosa;
	/**
	* Default empty Chocolate constructor
	*/
	public Chocolate() {
		super();
	}

	/**
	* Default Chocolate constructor
	*/
	public Chocolate(DulcesRosa dulcesRosa) {
    this.dulcesRosa = dulcesRosa;
  }

  public abstract String getNameChocolate();

  public DulcesRosa getDulcesRosa(){
    return dulcesRosa;
  }

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

  public abstract Boolean validate(int n);




}
