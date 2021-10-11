package com.company;

import java.util.Arrays;

public class Arrangement {

        private String arrangementName;
        private Bands[] performingBands;
        private String placering;
        private String dato;
        private String tidspunkt;
        private Billet[] billetter;
        private String performingBandPrice;
        private int billetName;

    public Arrangement(String arrangementName,Bands[] performingBands, String placering, String dato, String tidspunkt) {
        this.arrangementName = arrangementName;
        this.performingBands = performingBands;
        this.placering = placering;
        this.dato = dato;
        this.tidspunkt = tidspunkt;
    }

    @Override
    public String toString() {
        return arrangementName.toUpperCase() +
                "\n" + "\"\"\"\"\"\"\"\"\"\" \narrangementName= " + arrangementName + ",\n" +
                "PerformingBands= " + Arrays.toString(performingBands) +
                "\n placering= \'" + placering + "\'" +
                ",  dato= '" + dato + '\'' +
                ",  tidspunkt= '" + tidspunkt + '\'' +
                '}';
    }

    public Billet[] getBilletter(){
        return this.billetter;
    }

    public int getBilletName(){
        billetName = Billet.billetId++;
        return this.billetName;
    }

    public String getArrangementName(){
        return this.arrangementName;
    }
    public String getArrangementPlacering(){
        return this.placering;
    }
    public String getArrangementDato(){
        return this.dato;
    }
    public String getArrangementTidspunkt(){
        return this.tidspunkt;
    }


    public Billet købBillet(){

        Billet billetName = new Billet(arrangementName, performingBands, placering, dato, tidspunkt);

        return billetName;
    }

   /* public String showPerformingBands(){
        for (int i = 0; i < performingBands.length; i++) {
            System.out.println(performingBands[i]);
            return performingBands;
        }
    }   */


}
