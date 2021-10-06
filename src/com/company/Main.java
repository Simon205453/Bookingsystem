package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Kunde kunde1 = registerNewCustomer();
        System.out.println(kunde1);


    }
    static Kunde registerNewCustomer(){

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
}
