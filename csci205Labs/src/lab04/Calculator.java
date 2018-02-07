/* *****************************************
* CSCI205 - Software Engineering and Design
* Spring 2016
* Instructor: Your instructor
* Section: List time of your lecture
*
* Name: Anushikha Sharma
* Date: 01/29/2016
*
* Lab / Assignment: 
*
* Description:
*
* *****************************************/  
package lab04;
import java.util.Scanner;  
public class Calculator {  
    public static void main(String arg[])  {
	double ans = 0;
        Scanner in = new Scanner(System.in); 
	while (true){
 
        	System.out.print("Welcome to the Calculator\nEnter expressions with two numeric operands\nand a single operator from +,-,*,/,% or ^\n");
		System.out.println("Enter a simple arithmetic expression with spacing:");  
        	double operand1 = in.nextDouble();
		double operator = in.nextDouble();
		double operand2 = in.nextDouble();
		int options = in.nextInt();
		
		/*try {
    			double operand1  = Double.parseDouble(String);

		} catch (NumberFormatException ex) {
    			System.out.println("ERROR: Cannot parse operand 1");
		}

		try {
    			double operand2 = Double.parseDouble(String);

		} catch (NumberFormatException ex) {
    			System.out.println("ERROR: Cannot parse operand 2");
		}*/
		switch(options)
               	{
			case 1:
			ans = ans + operand1 + operand2 ;
			System.out.println("The result is " + ans);
			break;
			case 2:
			ans = ans + operand1 - operand2 ;
			System.out.println("The result is " + ans);
			break;
			case 3:
			ans = (operand1 * operand2) ;
			System.out.println("The result is " + ans);
			break;
			case 4:
			ans = ans + (operand1 / operand2) ;
			System.out.println("The result is " + ans);
			break;
			case 5:
			ans = ans + (operand1 % operand2) ;
			System.out.println("The result is " + ans);
			break;
			case 6:
			ans = ans + Math.pow(operand1, operand2) ;
			System.out.println("The result is " + ans);
			break; 
			default:
			System.out.println("Invalid operands or operator!");
			break;
		}       	
		System.out.print("Try again? [y | n] "); 
		if (in.next().equalsIgnoreCase("n")){
 			break;
		}
		System.out.println("Goodbye!"); 
        }  
    }  
}  

