public class Validator implements State{
  Machine machine;

  public Validator(Machine machine){
    this.machine = machine;
  }

  public void turningOn(){
    System.out.println("Ya esta encendida la máquina. Estamos validando");
  }
  public void turningOff(){System.out.println("Pedido validado");
    System.out.println("La maquina se apagara.");
    machine.setState(machine.getOff());

  }
  public void chooseProduct(int typeProduct, int numberProduct){
    System.out.println("Trayendo más ingredientes de la bodega. Rellenaremos el almacén con el 50% de su capacidad ");
    machine.getDulcesRosa().setWater(machine.getDulcesRosa().getWater()+(float)(machine.getDulcesRosa().getWater()*.50));
    machine.getDulcesRosa().setGrenetina(machine.getDulcesRosa().getGrenetina()+(float)(machine.getDulcesRosa().getGrenetina()*.50));
    machine.getDulcesRosa().setHoney(machine.getDulcesRosa().getHoney()+(float)(machine.getDulcesRosa().getHoney()*.50));
    machine.getDulcesRosa().setChamoy(machine.getDulcesRosa().getChamoy()+(float)(machine.getDulcesRosa().getChamoy()*.50));
    machine.getDulcesRosa().setAcidFlavoring(machine.getDulcesRosa().getAcidFlavoring()+(float)(machine.getDulcesRosa().getAcidFlavoring()*.50));
    machine.getDulcesRosa().setCocoaButter(machine.getDulcesRosa().getCocoaButter()+(float)(machine.getDulcesRosa().getCocoaButter()*.50));
    machine.getDulcesRosa().setCocoa(machine.getDulcesRosa().getCocoa()+(float)(machine.getDulcesRosa().getCocoa()*.50));
    machine.getDulcesRosa().setSugar(machine.getDulcesRosa().getSugar()+(float)(machine.getDulcesRosa().getSugar()*.50));
    machine.getDulcesRosa().setMilk(machine.getDulcesRosa().getMilk()+(float)(machine.getDulcesRosa().getMilk()*.50));
    machine.getDulcesRosa().setAlmond(machine.getDulcesRosa().getAlmond()+(float)(machine.getDulcesRosa().getAlmond()*.50));
    machine.getDulcesRosa().setChip(machine.getDulcesRosa().getChip()+(float)(machine.getDulcesRosa().getChip()*.50));
    machine.getDulcesRosa().setSalt(machine.getDulcesRosa().getSalt()+(float)(machine.getDulcesRosa().getSalt()*.50));
    machine.getDulcesRosa().setJam(machine.getDulcesRosa().getJam()+(float)(machine.getDulcesRosa().getJam()*.50));
    machine.getDulcesRosa().setEgg(machine.getDulcesRosa().getEgg()+(float)(machine.getDulcesRosa().getEgg()*.50));
    machine.getDulcesRosa().setFlour(machine.getDulcesRosa().getFlour()+(float)(machine.getDulcesRosa().getFlour()*.50));
    machine.setState(machine.getPreparingProduct());
  }
  public void suspend(){
    System.out.println("La maquina se suspendera");
    machine.setState(machine.getSuspended());
  }
  public void packProduct(){
    System.out.println("Aun no se ha validado el pedido");
  }
}
