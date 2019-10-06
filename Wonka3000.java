import java.util.Scanner;
public class Wonka3000 extends Machine{
  Scanner sc = new Scanner(System.in);
  Chocolate chocolate = null;
  Gummy gummy = null;
  Boolean validate = true;
  public Wonka3000(DulcesRosa dulcesRosa){
    super( dulcesRosa);
  }
  public boolean prepararDulce(){
    System.out.println("¿Que dulce quieres preparar?");
    System.out.println("    1.- Chocolate ");
    System.out.println("    2.- Gomitas");
    int answerCandy = sc.nextInt();
    switch(answerCandy){
      case 1:
        System.out.println("        Preparando en Wonka3000        ");
        System.out.println("¿Que tipo de chocolate quieres preparar?");
        System.out.println("    1. Chocolate de leche");
        System.out.println("    2. Chocolate oscuro");
        System.out.println("    3. Chocolate con almendra");
        int answerChocolate = sc.nextInt();
        System.out.println("¿Cuantos chocolates quieres preparar?");
        int numberChocolate = sc.nextInt();

        switch(answerChocolate){
          case 1:
            chocolate = new MilkChocolate(dulcesRosa);
            break;
          case 2:
            chocolate = new DarkChocolate(dulcesRosa);
            break;
          case 3:
            chocolate = new AlmondChocolate(dulcesRosa);
            break;
        }
        if(chocolate.validate(numberChocolate) == true){
          System.out.println("aqui si entra");
          System.out.println("Hay suficientes ingredientes para preparar los chocolates");
          chocolate.prepareChocolateTemplate(numberChocolate);
          validate=true;
        }else{
          System.out.println("No válido");
          validate = false;
        }
        break;

      case 2:
        System.out.println("        Preparando en Wonka3000        ");
        System.out.println("¿Que tipo de gomita quieres preparar?");
        System.out.println("    1. Osito dulce");
        System.out.println("    2. Gusanos acidos");
        System.out.println("    3. Frutas con chamoy");
        int answerGummy = sc.nextInt();
        System.out.println("¿Cuantos paquetes de gomitas quieres preparar?");
        int numberGummy = sc.nextInt();
        switch(answerGummy){
          case 1:
            gummy = new GummyBear(dulcesRosa);
            break;
          case 2:
            gummy = new GummyWorm(dulcesRosa);
            break;
          case 3:
            gummy = new GummyChamoy(dulcesRosa);
            break;
        }
        if(gummy.validate(numberGummy) == true){
          System.out.println("Hay suficientes ingredientes para preparar las gomitas");
          gummy.prepareGummyTemplate(numberGummy);
          validate = true;
        }else{
          System.out.println("No válido");
          validate = false;
        }
          break;
    }

    return validate;
  }
}
