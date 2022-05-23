package com.company;

public class HealthyBurger extends Hambuger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    public HealthyBurger(String name, String meat, double price, String breadRollType, String healthyExtra1Name, double healthExtra1Price) {
        super(name, meat, price, breadRollType);

        this.healthyExtra1Name = healthyExtra1Name;
    }

//    public void addHealthyAddition1(){
//        super.price += healthyExtra1Price;
//    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
