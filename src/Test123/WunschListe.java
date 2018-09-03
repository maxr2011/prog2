package Test123;

import java.io.Serializable;
import java.util.ArrayList;

public class WunschListe implements Serializable {

    private int eID;

    private ArrayList<Wunsch> WunscheL;

    public WunschListe(int i){
        this.eID = i;
        this.WunscheL = new ArrayList<Wunsch>();
    }

    public Wunsch getW(int i){
        return this.WunscheL.get(i);
    }

    public ArrayList<Wunsch> getWunscheL() {
        return WunscheL;
    }

    public void addW(Wunsch w){
        this.WunscheL.add(w);
    }

    public void removeW(Wunsch w){
        this.WunscheL.remove(w);
    }

    static public ArrayList<Wunsch> getTestList(){

        ArrayList<Wunsch> WL = new ArrayList<Wunsch>();

        Wunsch w1 = new Wunsch(1, 2);
        w1.setText("Grillkohle");

        Wunsch w2 = new Wunsch(2, 2);
        w2.setText("Fleisch");
        w2.setisW(false);

        Wunsch w3 = new Wunsch(3, 3);
        w3.setText("Bier");

        WL.add(w1);
        WL.add(w2);
        WL.add(w3);

        return WL;

    }

}
