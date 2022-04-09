package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return  this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge (int age){
        if(age > 100 || age <0){
            age =0;
        }
        this.age = age;
    }

    public boolean isTeen(){
        if(age> 12 && age <20){
            return true;

        }
        return false;
    }

    public String getFullName(){
        if (firstName.isEmpty() == true){
            return lastName;
        }
        else if(lastName.isEmpty()== true){
            return firstName;

        }
        else if( firstName.isEmpty() ==true && lastName.isEmpty()== true){
            return "";
        }
        return firstName+ " "+ lastName;
    }
}
