package com.company;

import java.util.Scanner;

public class Main {


    //Vi laver et public Arrangement, som kan tilgås af alle classes, men samtidigt også begrænser os til kun at have 1 arrangement af gangen.
    public static Arrangement smukfest;
    public static Arrangement roskildefestival;


    public static void main(String[] args) {

        //Vi registerer nogle bands, da vi ikke kan lave et arrangement uden at have bands der spiller til.

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

        Bands Kanye = new Bands("Kanye", "Rap", 10000, "23:00");
        Bands JustinBieber = new Bands("Justin Bieber", "Pop", 10000, "22:00");
        Bands HannahMontana = new Bands("Hannah Montana", "Pop", 12000, "20:00");

        Bands[] kunstnereTilRoskildeFestival = {Kanye, JustinBieber, HannahMontana};

        roskildefestival = new Arrangement("Roskilde Festival", kunstnereTilRoskildeFestival, "Roskilde", "1-7-2021", "10:00");
        Billet roskildeBillet1 = new Billet(roskildefestival.getArrangementName(), kunstnereTilRoskildeFestival, roskildefestival.getArrangementPlacering(), roskildefestival.getArrangementDato(), roskildefestival.getArrangementTidspunkt());

        System.out.println(roskildefestival);
        System.out.println(roskildeBillet1);

    }
}





