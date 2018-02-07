/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2016
 *
 * Name: Anushikha Sharma
 * Date: 01/26/2016
 *
 * Lab: Lab02, Exercise 2
 *
 * @author Brian King, 2012-Fall
 *
 * Description:
 * A simple program to ask the user for a temperature in F, and converts it to
 * Celsius.
 * *****************************************
 */

package lab02;

import java.util.Scanner;
import java.util.Formatter;	

public class FtoC {
    public static void main(String[] args) {
	Scanner user_input_temp = new Scanner(System.in);
	// Create the Scanner object, attached to console input
	while (true) {
	System.out.print("Enter a temperature in Fahrenheit: ");
	// Prompt user for a Fahrenheit temp
	int temp_Fahr = user_input_temp.nextInt();
        // Read and store the Fahrenheit temp
	int temp = (temp_Fahr - 32);
	double result = (double)(temp * 5) / 9;
        // Convert the temp to Celsius
	System.out.printf(temp_Fahr + " F" + " = " + result + " C\n");
	if (result <= 0){
	    System.out.println("Brr... it is Freezing out!");
	} else if (result > 0 && result <= 15){
            System.out.println("It's a bit cool out");
	} else if (result > 15 && result <= 30) {
	    System.out.println("It's comfortably warm");
	} else {
	    System.out.println("It's HOT! I need A/C!");
	}
	System.out.print("Try again? [y / n]: ");
	if (user_input_temp.next().equalsIgnoreCase("n"))
	    break ;
	}  
	System.out.println("Goodbye!");
    }
}

