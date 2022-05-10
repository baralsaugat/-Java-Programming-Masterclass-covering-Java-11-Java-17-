package com.company;

public class Fish extends  Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscle(){
        System.out.println("fish move the muscle first");

    }

    private void moveBackFin(){
        System.out.println("fish move the back fin second");
    }

    private void swim(int speed){
        moveMuscle();
        moveBackFin();
        super.move(speed);
    }
}
