package com.gtrxone;

import javax.swing.*;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price = 0;
    private String addition2Name;
    private double addition2Price = 0;
    private String addition3Name;
    private double addition3Price = 0;
    private String addition4Name;
    private double addition4Price = 0;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        System.out.println(name + " hamburger on a " + breadRollType + " roll with Sausage, price is " + price);
        double sum = price;
        if (addition1Name != null ) {
            sum += addition1Price;
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if (addition2Name != null) {
            sum += addition2Price;
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }
        if (addition3Name != null) {
            sum += addition3Price;
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }
        if (addition3Name != null) {
            sum += addition4Price;
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }
        return Math.round(sum * 100.0) / 100.0;
    }
}
