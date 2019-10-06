import java.util.Scanner;
public class Galleneitor500 extends Machine{
  Cookie cookie = null;
  Boolean validate = true;
  Scanner sc = new Scanner(System.in);

  public Galleneitor500(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }
  public Boolean prepareCookie(){
    System.out.println("¿Que tipo de galleta quieres preparar?");
    System.out.println("    1. Galletas Saladas");
    System.out.println("    2. Rellenas de Mermelada");
    System.out.println("    3. Galletas de Chispas de Chocolate");
    int answerCookie = sc.nextInt();
    System.out.println("¿Cuantas tandas de galletas quieres preparar? (cada tanda tiene 24 galletas)");
    int numberCookie = sc.nextInt();
    switch(answerCookie){
      case 1:
        cookie= new Cracker(dulcesRosa);
        break;
      case 2:
        cookie = new JamCookie(dulcesRosa);
        break;
      case 3:
        cookie = new ChipCookie(dulcesRosa);
        break;
    }
    if(cookie.validate(numberCookie) == true){
      System.out.println("Hay suficientes ingredientes para preparar las galletas");
      cookie.prepareCookieTemplate(numberCookie);
      validate = true;
    }else{
      System.out.println("No valido");
      validate = false;
    }
    return validate;
  }



}
