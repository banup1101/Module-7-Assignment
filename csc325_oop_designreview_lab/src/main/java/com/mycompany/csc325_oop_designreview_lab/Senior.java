package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    private int credits;
    public Senior(String name, short age, int credits){
        super(name, age); //we super this because Freshman extends Students
        this.credits = credits;

        if(credits > 85){
            System.out.println("The Senior has too many credits >:(");
        }
    }

    public int getCredits(){
        return credits;
    }

    @Override
    public String toString(){
        return "Senior: " + getName() + ", " + "Age: " + getAge() + ", " + "Credits: " + getCredits() + ", " + "GPA: " + getGpa();
    }




}
