package Uebung_12.Aufgabe_vier;

/**
 * Created by maxr2011 on 11.01.2018.
 */
public class BetterChangeCalculator extends SimpleChangeCalculator {

  @Override
  public int[] getChange(int euros, int cent){

        int zweiEuro = 0;
        int einEuro = 0;

        int fzc = 0;
        int zwc = 0;
        int zec = 0;
        int fuc = 0;
        int zuc = 0;
        int eic = 0;

        int Rest = 0;

        if(euros > 1 && (euros%2 == 0)){
          zweiEuro = (int) (euros/2);
          euros -= zweiEuro;
        } else if(euros > 1 && (euros%2 != 0)){
          zweiEuro = (int) (euros/2);
          einEuro = 1;
        } else if(euros > 0){
          einEuro = 1;
        }

        if(cent >= 50){
          fzc = 1;
          cent -= 50;
        }

        if(cent >= 40){
          zwc = 2;
          cent -= 40;
        }

        if(cent >= 30){
          zwc = 1;
          zec = 1;
          cent -= 30;
        }

        if(cent >= 20){
          zwc = 1;
          cent -= 20;
        }

        if(cent >= 10){
          zec = 1;
          cent -= 10;
        }

        if(cent >= 5){
          fuc = 1;
          cent -= 5;
        }

        if(cent >= 4){
          zuc = 2;
          cent -= 4;
        }

        if(cent >= 3){
          zuc = 1;
          eic = 1;
          cent -= 3;
        }

        if(cent >= 2){
          zuc = 1;
          cent -= 2;
        }

        if(cent >= 1){
          eic = 1;
          cent -= 1;
        }

        Rest = cent;
        System.out.println(Rest);


    return new int[] {
        eic, // alles in 1-Cent-Muenzen
        zuc,					// keine 2-Cent-Muenzen
        fuc,					// keine 5-Cent-Muenzen
        zec,					// keine 10-Cent-Muenzen
        zwc,					// keine 20-Cent-Muenzen
        fzc,					// keine 50-Cent-Muenzen
        einEuro,					// keine 1-Euro-Muenzen
        zweiEuro					// keine 2-Euro-Muenzen
    };
  }

}
