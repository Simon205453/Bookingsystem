package com.company;

public class Billet extends Arrangement{

    static int billetId;

    public Billet(String arrangementName, Bands[] performingBands, String placering, String dato, String tidspunkt) {
        super(arrangementName, performingBands, placering, dato, tidspunkt);

        }


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