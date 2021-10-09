package com.company;

public class Billet extends Arrangement{

    public Billet(String arrangementName, Bands[] performingBands, String placering, String dato, String tidspunkt) {
        super(arrangementName, performingBands, placering, dato, tidspunkt);

        }

    /*         for (int i = 1; i < 100; i++){
        if (billetId==i){
            billetId=i++;
        } else {
            billetId=i;
        }
    }*/


    @Override
    public String toString() {
        return "Billet{" +
                "ArrangementName = '" + getArrangementName() +'\'' +
                "   BilletID = " + getBilletName() + "}";
    }

    @Override
    public Billet købBillet(){
        super.købBillet();

        return købBillet();
    }

}