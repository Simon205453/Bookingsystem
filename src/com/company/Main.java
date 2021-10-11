package com.company;

import java.util.Scanner;

public class Main {


    //Vi laver et public Arrangement, som kan tilgås af alle classes, men samtidigt også begrænser os til kun at have 1 arrangement af gangen.
    public static Arrangement smukfest;
    public static Arrangement roskildefestival;

    /* static Bands registerBand(String name, String genre, double price, String koncertStart){
        Bands bandName = new Bands(name, genre, price, koncertStart);
        return bandName;                                    ---------- METODE TIL DET UBRUGELIGE
    }*/

    public static void main(String[] args) {

        //Vi registerer nogle bands, da vi ikke kan lave et arrangement uden at have bands der spiller til. <33

        //registerBand("Skillet", "Rock", 10000, "23:00");   --------- DETTE ER SGU NOK UBRUGELIGT
        Bands skillet = new Bands("Skillet", "Rock", 10000, "23:00");
        Bands metalica = new Bands("Metalica", "rock", 10000, "22:00");
        Bands fooFighters = new Bands("Foo Fighters", "rock", 12000, "20:00");
        //Vi tager vores ny kreerede bands og smider dem i en arraylist, så vi fint og nemt kan referere tilbage til dem.
        Bands[] performingBandsForSmukfest = {metalica, fooFighters, skillet};
        //Vi laver et public arrangement med de bands der lige er blevet lavet. Dette gør vi vha. en arraylist til performing bands
        smukfest = new Arrangement("Smukfest", performingBandsForSmukfest, "Grønscene", "7-7-2021", "19:00");

        //Vi laver nogle billetter til arrangementet hvor vi henter alle parametre fra metodekald i Arrangementclassen
        Billet smukfestBillet1 = new Billet(smukfest.getArrangementName(), performingBandsForSmukfest, smukfest.getArrangementPlacering(), smukfest.getArrangementDato(), smukfest.getArrangementTidspunkt());
        Billet smukfestBillet2 = new Billet(smukfest.getArrangementName(), performingBandsForSmukfest, smukfest.getArrangementPlacering(), smukfest.getArrangementDato(), smukfest.getArrangementTidspunkt());
        Billet[] billetterTilSmukfest = {smukfestBillet1, smukfestBillet2};

        System.out.println(smukfest);

            for (int i = 0; i < billetterTilSmukfest.length; i++) {
                System.out.println(billetterTilSmukfest[i]);
            }
        }
    }
        //System.out.println(smukfest.getTickets()[0]);
        // prøv at printe all available tickets
/*
        for (int i = 0; i < performingBandsForSmukfest.length; i++) {
            System.out.println(performingBandsForSmukfest[i]);
        }
        
        System.out.println(smukfest);

        //  Kunde kunde1 = registerNewCustomer();
        // System.out.println(kunde1);

    }

    static Kunde registerNewCustomer() {

        System.out.println("You have chosen to register, please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("please enter your mail");
        String mail = scanner.nextLine();
        System.out.println("please enter your adress");
        String adress = scanner.nextLine();
        System.out.println("please enter your phone number");
        int phoneNumber = scanner.nextInt();

        Kunde kunde1 = new Kunde();
        kunde1.register(name, mail, adress, phoneNumber);
        return kunde1;
    }



    /*static Arrangement orderNewBand(){
        Arrangement smukfest = new Arrangement();
        String kunstner = null;
        String placering = null;
        smukfest.orderBand(String kunstner, String placering, String dato, String tidspunkt);
    }*/



