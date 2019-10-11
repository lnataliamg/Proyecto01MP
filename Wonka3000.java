import java.util.Scanner;
public  class Wonka3000 extends Machine{
  Scanner sc = new Scanner(System.in);
  Chocolate chocolate = null;
  Gummy gummy = null;
  Boolean validate = true;
  public Wonka3000(DulcesRosa dulcesRosa){
    super( dulcesRosa);
  }

  public boolean prepareCandy(int typeProduct, int numberProduct){
    if(typeProduct < comprar4){
      switch (typeProduct) {
        case 1:
        chocolate = new AlmondChocolate(dulcesRosa);
        break;
        case 2:
        chocolate = new MilkChocolate(dulcesRosa);
        break;
        case 3:
        chocolate = new DarkChocolate(dulcesRosa);
        break;
      }
      if(chocolate.validate(numberProduct) == true){
        System.out.println("Hay suficientes ingredientes para preparar los chocolates");
        chocolate.prepareChocolateTemplate(numberProduct);
        validate=true;
      }else{
        System.out.println("No válido");
        validate = false;
      }
    }else if (typeProduct > 3 && typeProduct < 7){
      switch (typeProduct) {
        case 4:
        gummy = new GummyBear(dulcesRosa);
        break;
        case 5:
        gummy = new GummyWorm(dulcesRosa);
        break;
        case 6:
        gummy = new GummyChamoy(dulcesRosa);
        break;
      }
      if(gummy.validate(numberProduct) == true){
        System.out.println("Hay suficientes ingredientes para preparar las gomitas");
        gummy.prepareGummyTemplate(numberProduct);
        validate = true;
      }else{
        System.out.println("No válido");
        validate = false;
      }

    }

    return validate;

  }

}
