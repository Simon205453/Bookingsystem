package com.company;

public class Billet extends Arrangement{

    public Billet(String kunstner, String placering, String dato, String tidspunkt) {
        super(kunstner, placering, dato, tidspunkt);
    }

    public Billet(Arrangement smukfest) {
        super(smukfest);
    }

    @Override
    public void købBillet(){
        super.købBillet();


    }

}
