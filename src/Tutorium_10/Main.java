package Tutorium_10;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class Main {

  public static void main(String[] args) throws InterruptedException{

    Fahrrad f = new MountenBike();
    new FahrradDoppler(f)
        .fahren();

    Fahrrad g = new HollandFahrrad();
    FahrradDoppler fg = new FahrradDoppler(g);

    fg.fahren();

  }

}
