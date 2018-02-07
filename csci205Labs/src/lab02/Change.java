/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2016
 *
 * Name: Anushikha Sharma
 * Date: 01/27/2016
 *
 * Lab: Lab02, Exercise 4
 *
 * Description:
 * This is a simple program to compute a proper amount of change given some
 * number of pennies.
 *
 * @author BRK 2012-fall, with slight modifications in 2015
 */

package lab02;

import java.util.Scanner;

public class Change {

    final static int PENNIES_PER_QUARTER = 25;
    final static int PENNIES_PER_DOLLAR = 100;
    final static int PENNIES_PER_DIME = 10;
    final static int PENNIES_PER_NICKEL = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	while (true) {
        System.out.println("Enter the number of pennies: ");

        int pennies = in.nextInt();
	
	System.out.format("%d pennies breaks down to: \n ", pennies);
	
	// Compute number of dollars
	int dollars = pennies / PENNIES_PER_DOLLAR;
	
	// Compute number of pennies leftover
        pennies %= PENNIES_PER_DOLLAR;

        // Compute number of quarters
        int quarters = pennies / PENNIES_PER_QUARTER;

        // Compute number of pennies leftover
        pennies %= PENNIES_PER_QUARTER;
	
	// Compute number of dimes
        int dimes = pennies / PENNIES_PER_DIME;

	// Compute number of pennies leftover
	pennies %= PENNIES_PER_DIME;
       
	// Compute number of nickels
        int nickels = pennies / PENNIES_PER_NICKEL;
	
	// Compute number of pennies leftover
	pennies %= PENNIES_PER_NICKEL;


        // Output the results
        System.out.format("%d dollars = $ %.2f \n %d quarters = $ %.2f \n %d dimes    = $ %.2f \n %d nickels  = $ %.2f \n %d pennies  = $ %.2f \n", dollars, dollars * PENNIES_PER_DOLLAR / 100.0, quarters, quarters * PENNIES_PER_QUARTER / 100.0, dimes, dimes * PENNIES_PER_DIME / 100.0, nickels, nickels * PENNIES_PER_NICKEL / 100.0, pennies, pennies/100.0);
	
	System.out.print("Try again? [y / n]: ");
	if (in.next().equalsIgnoreCase("n"))
	    break ;
	}
	System.out.println("Goodbye!");
    }
}
