/* *****************************************
* CSCI205 - Software Engineering and Design
* Spring 2016
* Instructor: Brian King
* Section: MWF 1:00 PM
*
* Name: Anushikha
* Date: 01/25/2016
*
* Lab / Assignment:Lab01
*
* Description:"Hello World" program in Java
*
* *****************************************/
package lab01;
public class Hello
{
	public static void main( String[] args ){
		System.out.println("Programming is not a spectator sport!");
		float estimated = System.currentTimeMillis() % 1000;
		System.out.println("Time to execute: " +  estimated + " ms");
 		System.exit(0);
 	}
}
