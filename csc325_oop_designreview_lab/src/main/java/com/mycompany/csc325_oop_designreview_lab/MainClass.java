/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

	 /*
	 the data types we are using are: String, Short, and Double
	 some of the parameters were not the right data types so i had to fix it
	 I am not sure if gpa and credits are the same thing or if they are seperate (none of the todos were to make credits)
	 i just made credits its own thing
	 that makes more sense since we are inputting a gpa for there to be one
	 std1 was used twice so i changed that
	*/

		Student std1= new Student("James", (short) 20);
                // ToDo 11: Add a toString method for the Senior class

	 /*
	 std2 and std3 were being defined as new Student instead of Freshman or Senior
	  */

		Freshman std2= new Freshman("James", (short) 20, 12); // name, age, credits
	 	Senior std3 = new Senior("John", (short) 30, 90);


		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

	 //make scanner
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the GPA of the Student: ");
	 double gpa = scanner.nextDouble();

	 //give std1 the gpa user inputs
	 std1.setGpa(gpa);

	 System.out.println(std1);

	 //Output for the Freshman
	 System.out.println("Enter the GPA of the Freshman: ");
	 gpa = scanner.nextDouble();

	 //give std2 the gpa user inputs
	 std2.setGpa(gpa);

	 System.out.println(std2);

	 //Output for the Senior
	 System.out.println("Enter the GPA of the Senior: ");
	 gpa = scanner.nextDouble();

	 //give std3 the gpa user inputs
	 std3.setGpa(gpa);

	 System.out.println(std3);


		// ToDo 13: add comments and explain your code

		// ToDo 14: submit using a pull request.
	}

}

