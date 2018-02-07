/* *****************************************
* CSCI205 - Software Engineering and Design
* Spring 2016
* Instructor: Your instructor
* Section: List time of your lecture
*
* Name: Anushikha Sharma
* Date: 01/29/2016
*
* Lab / Assignment: Lab03
*
* Description:Fibonacci Sequence in java
*
* *****************************************/
package lab03;

import java.util.Scanner;

/**
 * A simple class designed to give the user an opportunity to test a recursive
 * and non-recursive version of fibonacci
 *
 * Date: 2015-fall
 * @author BRK
 */
public class Fibonacci {

    /**
     * Compute the nth fibonacci number recursively
     *
     * @param n - the nth number to find
     * @return the nth number in the fibonacci sequence
     */
    public static int recFib(int n) {
        if(n == 0) {
	    return 0;
	}else if(n == 1){
	    return 1;
	}else {
	    return recFib(n-1) + recFib(n-2);
    }
    }

    /**
     * Compute the nth fibonacci number non-recursively, using a while loop.
     *
     * @param n - the nth number to find
     * @return the nth number in the fibonacci sequence
     */
    public static int nonRecFib(int n) {
        if (n <= 1){
	    return n;
       	} 
	int nonRecFib = 1;
	int PrevFib = 1;
	for (int i = 2; i < n; ++i){
	    int temp = nonRecFib;
	    nonRecFib += PrevFib;
	    PrevFib = temp;
	}
        return nonRecFib;
    }

    /**
     * Main program to test both fibonacci methods
     */
    public static void main(String[] args) {
        System.out.println("What fibonacci number do you want?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Recursive fib: " + recFib(n));
        System.out.println("Non-recursive fib: " + nonRecFib(n));
    }

}
