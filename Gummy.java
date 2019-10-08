public abstract class Gummy{
  DulcesRosa dulcesRosa;
  public Gummy(){
    super();
  }
  public Gummy(DulcesRosa dulcesRosa){
    this.dulcesRosa = dulcesRosa;
  }

  public abstract String getNameGummy();

  public void prepareGummyTemplate(int n){
    if(n==1){
      System.out.println("        .....Preparando 1 paquete de gomitas: " + getNameGummy() +".....\n");
    }else if (n>1){
      System.out.println("        ....Preparando " + n+ " paquetes de gomitas: " + getNameGummy() +"....\n");
    }

    chooseGummyMold();
    prepareGrenetina(n);
    addingFlavoring(n);
    addMixMold();
    finishGummmy();
  }
  public abstract void chooseGummyMold();

  public abstract void prepareGrenetina(int n);
  public abstract void addingFlavoring(int n);
  public void addMixMold(){
    System.out.println("Agregando mezcla al molde elegido");
  }
  public void finishGummmy(){
    System.out.println("Llevando las gomitas al congelador");
    System.out.println("Esperando 5 horas a que se enfrien");
    System.out.println("Sacando las gomtias del congelador");
    System.out.println("Gomitas finalizadas");
  }

  public abstract Boolean validate(int n);

}
