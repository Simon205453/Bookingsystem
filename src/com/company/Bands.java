package com.company;

public class Bands {
    private String name;
    private String genre;
    private double price;
    private String koncertStart;

    public Bands(String name, String genre, double price, String koncertStart) {
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.koncertStart = koncertStart;
    }

    @Override
    public String toString() {
        return "\n------------------------------------- \n " +
                "name= " + name +
                ", genre= " + genre + ",\n" +
                " price= " + price +
                ", koncertStart= " + koncertStart + ",\n" +
                "-------------------------------------";
    }
}
