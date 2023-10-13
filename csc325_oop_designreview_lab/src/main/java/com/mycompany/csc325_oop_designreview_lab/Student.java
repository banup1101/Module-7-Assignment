/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human (Use Extends)
    private double gpa;


    //a student only has a name and an age. THERE IS NO GPA WE ARE INPUTTING WHEN PROGRAM IS RAN
    public Student(String name, short age){
        super(name, age); //we get this because Student extends Human
    }

    //getter and setter for gpa
    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    //address stuff since it is abstract in human
    @Override
    public String getAddress(){
        return "Students Address";
    }

    public void setAddress(String address){
    }



    //toString method for Student class
    @Override
    public String toString(){
        return "Student: " + getName() + ", " + "Age: " + getAge() + ", " + "GPA: " + getGpa();
    }


	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter

	// ToDo 4: Add comments to your code
}
