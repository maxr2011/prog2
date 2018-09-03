package Tutorium_9.mitHand;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class Computer {

  private int serial;
  private String vendor;
  private int cores;
  private Betriebssystem  OS;

  private Computer(int s, String v, int c, Betriebssystem o){
    this.serial = s;
    this.vendor = v;
    this.cores = c;
    this.OS = o;
  }

  public void ausfuehren(Programm programm){

    for(int i = 0; i < cores; i++){
      new Thread(() -> {

        try{
          if(OS == Betriebssystem.WindowsXP){
            Thread.sleep(5000);
          }
          if(OS == Betriebssystem.Windows10){
            Thread.sleep(100);
          }
        } catch (InterruptedException IE){
          IE.printStackTrace();
        }

        programm.run();

      }).start();
    }

  }

  public static class ComputerBuilder{

    int serial; String vendor;
    int cores = 1; Betriebssystem OS = Betriebssystem.Windows10;

    public ComputerBuilder(int s, String v){
      this.serial = s;
      this.vendor = v;
    }

    public ComputerBuilder withCores(int c){
      this.cores = c;
      return this;
    }

    public ComputerBuilder withOS(Betriebssystem b){
      this.OS = b;
      return this;
    }

    public Computer build(){
      return new Computer(serial, vendor, cores, OS);
    }

  }

  public static void main(String[] args){

  }

}
