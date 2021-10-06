package com.company;

public class Arrangement {

        private String kunstner;
        private String placering;
        private String dato;
        private String tidspunkt;
        private Billet[] tickets;
        private String performingBandPrice;

    public Arrangement(String kunstner, String placering, String dato, String tidspunkt, Billet[] tickets) {
        this.kunstner = kunstner;
        this.placering = placering;
        this.dato = dato;
        this.tidspunkt = tidspunkt;
        this.tickets = tickets;
    }

    public Billet[] getTickets(){
        return this.tickets;
    }


    @Override
    public String toString() {
        return "Arrangement{" +
                "kunstner='" + kunstner + '\'' +
                ", placering='" + placering + '\'' +
                ", dato='" + dato + '\'' +
                ", tidspunkt='" + tidspunkt + '\'' +
                '}';
    }

    public Billet købBillet(){
        Billet billetTilMetalica = new Billet(this.kunstner, this.placering, this.dato, this.tidspunkt, this.tickets);
        return billetTilMetalica;
    }
    public int getPerformingBandPrice(){

        int price = 5000;

        return price;
    }
   /* public String showPerformingBands(){
        for (int i = 0; i < performingBands.length; i++) {
            System.out.println(performingBands[i]);
            return performingBands;
        }
    }   */


}
