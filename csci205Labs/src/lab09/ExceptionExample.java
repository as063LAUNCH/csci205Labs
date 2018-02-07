/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author as063
 */
public class ExceptionExample {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[SIZE];
        int i = 0;
        do {
            try {
                System.out.print(
                        "Enter an index to fill, or " + SIZE + " to finish: ");
                i = in.nextInt();
                if (i != SIZE) {
                    x[i] = i;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(i + " is out of range! Try again!");
                continue;
            } catch (InputMismatchException e) {
                System.out.println("Please enter integers! Try again!");
                in.nextLine();
                continue;
            }
        } while (i != SIZE);
    }
}

