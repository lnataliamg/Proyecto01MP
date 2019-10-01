import java.util.Scanner;
public class Wonka3000{
  float cocoaButter;
  float cocoa;
  float sugar;
  float milk;
  float almond;
  Scanner sc = new Scanner(System.in);
      Chocolate chocolate = null;

  public Wonka3000(){

  }
  public Wonka3000(float cocoaButter, float cocoa, float sugar, float milk, float almond ){
    this.cocoaButter = cocoaButter;
    this.cocoa = cocoa;
    this.sugar = sugar;
    this.milk = milk;
    this.almond= almond;
  }

  public void setCocoaButter(float cocoaButter){
    this.cocoaButter = cocoaButter;
  }

  public void setCocoa(float cocoa){
    this.cocoa = cocoa;
  }

  public void setSugar(float sugar){
    this.sugar = sugar;
  }

  public void setMilk(float milk){
    this.milk = milk;
  }

  public void setAlmond(float almond){
    this.almond = almond;
  }

  public float getCocoaButter( ){
    return cocoaButter;
  }

  public float getCocoa( ){
    return cocoa;
  }

  public float getSugar( ){
    return sugar;
  }

  public float getMilk( ){
    return milk;
  }

  public float getAlmond( ){
    return  almond;
  }

  public void prepararDulce(int n){
    System.out.println("¿Que dulce quieres preparar?");
    System.out.println("    1.- Chocolate ");
    System.out.println("    2.- Gomitas");
    System.out.println("    3.- Galletas");
    int answerCandy = sc.nextInt();
    switch(answerCandy){
      case 1:
        System.out.println("¿Que tipo de chocolate quieres preparar?");
        System.out.println("    1. Chocolate de leche");
        System.out.println("    2. Chocolate oscuro");
        System.out.println("    3. Chocolate con almendra");
        int answerChocolate = sc.nextInt();
        System.out.println("¿Cuantos chocolates quieres preparar?");
        int numberChocolate = sc.nextInt();

        switch(answerChocolate){
          case 1:
            chocolate = new MilkChocolate(this);
            break;
          case 2:
            chocolate = new DarkChocolate(this);
            break;
          case 3:
            chocolate = new AlmondChocolate(this);
            break;
        }

        chocolate.prepareChocolateTemplate(numberChocolate);
        break;
    }
  }



	/**
	* Create string representation of Wonka3000 for printing
	* @return
	*/
	@Override
	public String toString() {
		return "La maquina Wonka3000 tiene: \n Manteca de cacao: " + cocoaButter + "kg\n Cacao: " + cocoa + "kg\n Azucar: " + sugar + "kg\n Leche: " + milk + "kg\n Almendras: " + almond + "kg";
	}
}
