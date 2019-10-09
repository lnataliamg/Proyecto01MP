import java.util.Scanner;
public class Galleneitor500 extends Machine{
  Cookie cookie = null;
  Boolean validate = true;
  Scanner sc = new Scanner(System.in);

  public Galleneitor500(DulcesRosa dulcesRosa){
    super(dulcesRosa);
  }
  public Boolean prepareCookie(int typeProduct, int numberProduct){
    switch(typeProduct){
      case 7:
        cookie= new Cracker(dulcesRosa);
        break;
      case 8:
        cookie = new JamCookie(dulcesRosa);
        break;
      case 9:
        cookie = new ChipCookie(dulcesRosa);
        break;
    }
    if(cookie.validate(numberProduct) == true){
      System.out.println("Hay suficientes ingredientes para preparar las galletas");
      cookie.prepareCookieTemplate(numberProduct);
      validate = true;
    }else{
      System.out.println("No valido");
      validate = false;
    }
    return validate;
  }



}
