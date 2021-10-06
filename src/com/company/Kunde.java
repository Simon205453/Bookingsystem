package com.company;

import java.util.Scanner;

public class Kunde {

    private String name;
    private String mail;
    private String adress;
    private int phoneNumber;


    public void register(String name, String mail, String adress, int phoneNumber) {
        this.name = name;
        this.mail = mail;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
