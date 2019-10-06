import java.util.Scanner;
public class DulcesRosa{
  float flour;
  float egg;
  float salt;
  float jam;
  float chip;
  float sugar;
  float cocoaButter;
  float cocoa;
  float milk;
  float almond;
  float water;
  float grenetina;
  float honey;
  float acidFlavoring;
  float chamoy;
  Scanner sc = new Scanner(System.in);
  Cookie cookie = null;
  Chocolate chocolate = null;
  Gummy gummy = null;

  public DulcesRosa(float cocoaButter, float cocoa, float sugar, float milk, float almond, float water, float grenetina, float honey, float acidFlavoring, float chamoy,float flour, float egg, float salt, float jam, float chip){
    this.cocoaButter = cocoaButter;
    this.cocoa = cocoa;
    this.sugar = sugar;
    this.milk = milk;
    this.almond= almond;
    this.water= water;
    this.grenetina= grenetina;
    this.honey= honey;
    this.acidFlavoring = acidFlavoring;
    this.chamoy = chamoy;
    this.flour= flour;
    this.egg = egg;
    this.salt = salt;
    this.jam = jam;
    this.chip = chip;
  }

  public void setAllDulces(float cocoaButter, float cocoa, float sugar, float milk, float almond, float water, float grenetina, float honey, float acidFlavoring, float chamoy,float flour, float egg, float salt, float jam, float chip){
    this.cocoaButter = cocoaButter;
    this.cocoa = cocoa;
    this.sugar = sugar;
    this.milk = milk;
    this.almond= almond;
    this.water= water;
    this.grenetina= grenetina;
    this.honey= honey;
    this.acidFlavoring = acidFlavoring;
    this.chamoy = chamoy;
    this.flour= flour;
    this.egg = egg;
    this.salt = salt;
    this.jam = jam;
    this.chip = chip;
  }


    public void setWater(float water){
      this.water= water;
    }

    public void setGrenetina(float grenetina){
      this.grenetina= grenetina;
    }
    public void setHoney(float honey){
      this.honey= honey;
    }

    public void setChamoy(float chamoy){
      this.chamoy= chamoy;
    }

    public void setAcidFlavoring(float acidFlavoring){
      this.acidFlavoring = acidFlavoring;
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
    public float getWater(){
      return water;
    }

    public float getGrenetina(){
      return grenetina;
    }

    public float getHoney(){
      return honey;
    }


    public float getAcidFlavoring(){
      return acidFlavoring;
    }

    public float getChamoy(){
      return chamoy;
    }
    public void setChip(float chip){
      this.chip = chip;
    }
    public void setSalt(float salt){
      this.salt = salt;
    }
    public void setJam(float jam){
      this.jam = jam;
    }
    public void setEgg(float egg){
      this.egg = egg;
    }
    public void setFlour(float flour){
      this.flour = flour;
    }
    public float getFlour(){
      return flour;
    }

    public float getEgg(){
      return egg;
    }

    public float getSalt(){
      return salt;
    }

    public float getChip(){
      return chip;
    }

    public float getJam(){
      return jam;
    }

    public String toString(){
      String string = "El almacen tiene: ";
      string+= "\n Harina: " + flour + "kg";
      string+= "\n Huevos: " + egg + "kg";
      string+= "\n Azucar: " + sugar + "kg";
      string+= "\n Leche: " + milk + "L";
      string+= "\n Sal: " + salt + "kg";
      string+= "\n Mermelada : " + jam + "kg";
      string+= "\n Chispas de chocolate: " + chip+ "kg";
      string+= "\n Agua: " + water + "L";
      string+= "\n Grenetina: " + grenetina + "kg";
      string+= "\n Manteca de cacao: " + cocoaButter + "kg";
      string+= "\n Miel de maiz: " + honey + "L";
      string+= "\n Cacao: " + cocoa + "kg";
      string+= "\n Almendras: " + almond + "kg";
      string+= "\n Saborizante acido: " + acidFlavoring + "kg";
      string+= "\n Chamoy: " + chamoy + "L";
      return string;
    }


}
