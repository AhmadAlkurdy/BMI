/*
Name: Ahmad Alkurdy
Date 8/23/2017
Module: 1
Description:
Create a BMI calculator that reads the user's weight in pounds and height in inches,
then calculates and displays the user's body mass index.  Also, display the following
information from the Department of Health and Human Services/ National Institutes of 
Health so the user can evaluate his/her BMI.
BMI VALUES
Underweight:    less than 18.5
Normal:             between 18.5 and 24.9
Overweight:      between 25 and 29.9
Obese:              30 or greater


 */

package BMI;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        Scanner input = new Scanner( System.in );
        
        double weight; // store the weight
        double height;// store the height
        double IBM;//store the IBM after calculation
        
        //print welcome message 
        System.out.println( "Welcome to the IBM calculator" );
        System.out.println("");
	      
        //obtain the weight in Pounds      
        System.out.print("Enter your weight in pounds: ");
        weight = input.nextInt();
        
        //obtain the height in inches
         System.out.print("Enter your height in inches: ");
         height = input.nextInt();
         
         //calculating the IBM 
         IBM = (weight*703)/(height*height);
         
         ////display the IBM
         System.out.printf("Your IBM = %.2f\n ", IBM);
         
         //if statment to explaing what the IBM of the Presron represent
         if (IBM < 18.5)
         {
             System.out.println("You are underweight!\n");
         }
         if (IBM >= 18.5 && IBM <= 24.9)
         {
             System.out.println("Your IBM is normal!\n");
         }       
         if (IBM >= 25 && IBM <= 29.9)
         {
             System.out.println("You are overweight!\n");
         }   
          if (IBM >= 30)
         {
             System.out.println("You are obese!\n");
         }
         
        
    }
    
}
