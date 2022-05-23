package com.company;

public class Hambuger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hambuger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println("The price of hamburger with" +meat + " is " + price);
    }
//    String addition1Name;
//    double addition1Price;
//    String addition2Name;
//    double addition2Price;
//    String addition3Name;
//    double addition3Price; String addition4Name;
//    double addition4Price;




    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println("added extra" + addition1Name + "with a price of " + addition1Price);
    }
//    public void addHamburgerAddition2(){
//        price += addition2Price;
//    }
//    public void addHamburgerAddition3(){
//        price += addition3Price;
//    }
//    public void addHamburgerAddition4(){
//        price += addition4Price;
//    }
    public double itemizeHamburger(){
        return price;
    }
}
