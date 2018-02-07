/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2016
 *
 * Name: Anushikha Sharma
 * Date: 01/27/2016
 *
 * Lab: Lab02, Exercise 5
 *
 * Description:
 * This is a simple program to compute the volume of a sphere and round it to the neart integer
 *
 * @author BRK 2012-fall, with slight modifications in 2015
 */
package lab02;

import java.lang.Math;
import java.util.Scanner;

public class Sphere {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of a sphere: " );

        float sphere = in.nextFloat();
	double Volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( sphere, 3 );
	System.out.printf("The volume is: %.2f \n", Volume);
	System.out.printf( "Rounded to the nearest integer: %d",( Math.round(Volume)));
	

}
}

	
