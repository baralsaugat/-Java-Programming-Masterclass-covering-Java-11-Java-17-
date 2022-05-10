package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Animal("Animal", 1,1,5,5);
        Dog dog = new Dog("puppy", 12,12,2,4,1,46,"long silky");
Fish fish = new Fish("dora", 1,1,1,1,11,2,1);
        dog.eat();
        dog.walk();
        dog.run();
        fish.swim(12);
    }


}
