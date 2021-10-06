package com.company;

public class Arrangement {

        private String kunstner;
        private String placering;
        private String dato;
        private String tidspunkt;

    public void orderBand(String kunstner, String placering, String dato, String tidspunkt) {
        this.kunstner = kunstner;
        this.placering = placering;
        this.dato = dato;
        this.tidspunkt = tidspunkt;
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
}
