package Tutorium_9;

import packages.staff.Professor;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class Computer {

  private int seriennummer;
  private String hersteller;
  private int cores;
  private Betriebssystem OS;

  private Computer(int s, String h, int c, Betriebssystem o){
      this.seriennummer = s;
      this.hersteller = h;
      this.cores = c;
      this.OS = o;
  }

  void ausfuehren(Programm programm) {

    for(int i = 0; i < cores; i++){

      new Thread(() -> {

        try {
          if(OS == Betriebssystem.WindowsXP)
            Thread.sleep(5000);
          if(OS == Betriebssystem.Windows10)
            Thread.sleep(100);
        } catch (InterruptedException e){
          e.printStackTrace();
        }

        programm.run();

      }).start();
      
      /*
      if(OS == Betriebssystem.Windows10){
        Thread T = new Thread(() -> {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e){
            System.out.println("Sleep konnte nicht ausgeführt werden.");
          }
          programm.run();
        });
        T.start();
      } else if(OS == Betriebssystem.WindowsXP) {

        Thread T = new Thread(new Runnable() {
          @Override
          public void run() {
            try {
              Thread.sleep(5000);
            } catch (InterruptedException e){
              System.out.println("Sleep konnte nicht ausgeführt werden.");
            }
            programm.run();
          }
        });
        T.start();


      } else {
        Thread T = new Thread(new Runnable() {
          @Override
          public void run() {
            programm.run();
          }
        });
        T.start();
      }
      */

    }

  }

  public static class ComputerBuilder {

    int seriennummer;
    String hersteller;
    int cores;
    Betriebssystem OS;

    public ComputerBuilder(int s, String h){
      this.seriennummer = s;
      this.hersteller = h;
      this.cores = 1;
      this.OS = Betriebssystem.Windows10;
    }

    public ComputerBuilder withCores(int i){
      this.cores = i;
      return this;
    }

    public ComputerBuilder withOS(Betriebssystem os){
      this.OS  = os;
      return this;
    }

    public Computer build(){
      return new Computer(seriennummer, hersteller, cores, OS);
    }

  }

  public static void main(String[] args){

    Computer c = new ComputerBuilder(1029380980, "Acer")
        .withCores(20)
        .withOS(Betriebssystem.Windows10)
        .build();

    /*
    Programm p = new Programm() {
      @Override
      public void run() {
        System.out.println("Hello World");
      }
    };

    c.ausfuehren(p);
    */

    c.ausfuehren(() -> {
      System.out.println("Hello World!");
    });

  }

}
