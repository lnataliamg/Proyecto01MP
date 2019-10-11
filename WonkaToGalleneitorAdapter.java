public class WonkaToGalleneitorAdapter extends Wonka3000 implements IGalleneitor{
  public WonkaToGalleneitorAdapter(DulcesRosa dulcesRosa){
    super( dulcesRosa);
  }
  public void packCookie(){
    pack();
    System.out.println("Estoy empaquetando desde el adaptador de Galleneitor");
  }
}
