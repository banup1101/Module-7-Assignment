package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{
    private int credits;
    public Freshman(String name, short age, int credits){
        super(name, age); //we super this because Freshman extends Student
        this.credits = credits;
    }

    public int getCredits(){
        return credits;
    }



    //toString method for Freshman class
    @Override
    public String toString(){
        return "Freshman: " + getName() + ", " + "Age: " + getAge() + ", " + "Credits: " + getCredits() + ", " + "GPA: " + getGpa();
    }


}
