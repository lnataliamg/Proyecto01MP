public abstract class Cookie extends Product{
  public Cookie(){
    super();
  }

  public Cookie(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }

  public abstract String getNameCookie();

  public void prepareCookieTemplate(int n){
    if(n==1){
      System.out.println("        .....Preparando 1 tanda de " + getNameCookie() + " 24 galletas una tanda .....\n");
    }else if (n>1){
      System.out.println("        ....Preparando " + n+ " tandas de " + getNameCookie() +" "+ (24*n) + " galletas ....\n");
    }else{
      System.out.println("Cantidad inválida");
    }
    mixingEggs(n);
    mixingIngredients(n);
    bakingMold();
    baking();

  }

  public abstract void mixingEggs(int n);
  public abstract void mixingIngredients(int n);
  public void bakingMold(){
    System.out.println("Poneindo masa en las charolas para hornear");
  }
  public void baking(){
    System.out.println("Cocinando a 190°C las galletas");
    System.out.println("Galletas listas");
  }

  public abstract Boolean validate(int n);






}
