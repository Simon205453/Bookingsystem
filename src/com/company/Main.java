package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bands metalica = new Bands("Metalica", "rock",  "22:00");
        Bands fooFighters = new Bands("Foo Fighters", "rock",  "20:00");
        Billet billetTilSmuk = new Billet("asdf", "placering", "dato", "tidspunkt");
        Billet billetTilSmuk2 = new Billet("ticket2", "placering", "dato", "tidspunkt");
        Billet[] ticketsForSmukfest = {billetTilSmuk, billetTilSmuk2};
        Arrangement smukfest = new Arrangement("metalica", "grønscene", "7-7-2020", "22:00", ticketsForSmukfest );
        Bands[] performingBands = {metalica, fooFighters};

        System.out.println(smukfest.getTickets()[0]);
            // prøv at printe all available tickets
        for (int i = 0; i < performingBands.length; i++) {
            System.out.println(performingBands[i]);


        }
        for (int i = 0; i < ticketsForSmukfest.length; i++) {
            System.out.println(smukfest.getTickets()[i]);
        }

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


}
