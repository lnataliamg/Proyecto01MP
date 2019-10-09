public class Machine{
  DulcesRosa dulcesRosa;
  State off;
  State on;
  State suspended;
  State validator;
  State preparingProduct;
  State productFinished;
  State end;
  State state;


  public Machine(DulcesRosa dulcesRosa){
    this.dulcesRosa = dulcesRosa;
    off = new Off(this);
    on = new On(this);
    suspended = new Suspended(this);
    validator = new Validator(this);
    preparingProduct = new PreparingProduct(this);
    productFinished = new ProductFinished(this);
    end = new End(this);
  }

  public State getValidator(){
    return validator;
  }

  public State getPreparingProduct(){
    return preparingProduct;
  }
  public State getProductFinished(){
    return productFinished;
  }
  public State getEnd(){
    return end;
  }

  public State getOff(){
    return off;
  }

  public State getOn(){
    return on;
  }

  public State getSuspended(){
    return suspended;
  }

  public void empaquetar(){
    System.out.println("Empaquetando cada producto con envolturas marca -Dulces Rosa-");
  }

  public void setState(State state){
    this.state = state;
  }

  public void turningOn(){
    state.turningOn();
  }

  public void turningOff(){
    state.turningOff();
  }

  public void chooseProduct(int typeProduct, int numberProduct){
    state.chooseProduct( typeProduct,  numberProduct);
  }
  public void suspend(){
    state.suspend();
  }

  public void packProduct(){
    state.packProduct();
  }

  public DulcesRosa getDulcesRosa(){
    return dulcesRosa;
  }
}
