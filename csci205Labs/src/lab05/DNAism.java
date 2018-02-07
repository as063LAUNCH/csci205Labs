/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2016
 *
 * Name: Anushikha Sharma
 * Date: Feb 4, 2016
 * Time: 8:04:44 PM
 *
 * Project: csci205_
 * Package: lab05
 * File: DNAism
 * Description: Generating DNA code
 *
 * ****************************************
 */
package lab05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anushikha Sharma
 */
public class DNAism {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hello. Welcome to the DNA simulator. How long? ");
        int length = in.nextInt();

        System.out.print(
                "What is the percentage of GC-content? (enter a number not a percantage): ");
        double gcContentPct = in.nextInt();

        char[] generateDNA;
        generateDNA = generateDNA(length, gcContentPct);

        printDNAStats(generateDNA);
        printLongestRepeat(generateDNA);
    }

    public static char[] generateDNA(int length, double gcContentPct) {
        Random rand = new Random();
        char[] DNA;
        DNA = new char[length];
        for (int i = 0; i < length; i++) {
            int x = rand.nextInt(100);
            if (x <= gcContentPct) {
                int y = rand.nextInt(2);
                if (y == 1) {
                    DNA[i] = 'G';
                } else {
                    DNA[i] = 'C';
                }
            } else {
                int y = rand.nextInt(2);
                if (y == 1) {
                    DNA[i] = 'A';
                } else {
                    DNA[i] = 'T';
                }

            }
        }
        return DNA;
    }

    public static void printDNAStats(char[] dna) {
        int NUM_A = 0;
        int NUM_C = 0;
        int NUM_G = 0;
        int NUM_T = 0;

        for (int i = 0; i < dna.length; i++) {
            if (dna[i] == 'A') {
                NUM_A += 1;
            } else if (dna[i] == 'C') {
                NUM_C += 1;
            } else if (dna[i] == 'G') {
                NUM_G += 1;
            } else {
                NUM_T += 1;
            }
        }
        System.out.println("Generating... Please wait");
        System.out.println("COMPLETE!");

        System.out.println("Actual content of DNA sequence");

        System.out.printf("A:    %d   (%.2f)%n", NUM_A,
                          ((double) NUM_A / dna.length) * 100);
        System.out.printf("C:    %d   (%.2f)%n", NUM_C,
                          ((double) NUM_C / dna.length) * 100);
        System.out.printf("G:    %d   (%.2f)%n", NUM_G,
                          ((double) NUM_G / dna.length) * 100);
        System.out.printf("T:    %d   (%.2f)%n", NUM_T,
                          ((double) NUM_T / dna.length) * 100);

    }

    public static void printLongestRepeat(char[] dna) {
        int start = 1;
        char type = 0;
        int index = 0;
        int max = 0;

        for (int i = 1; i < dna.length; i++) {
            if (dna[i - 1] == dna[i]) {
                start++;
            } else {
                if (start > max) {
                    max = start;
                    type = dna[i - 1];
                }
                start = 1;
            }

        }
        if (start > max) {
            max = start;
            type = dna[dna.length - 1];
        }
        System.out.println(Arrays.toString(dna));
        System.out.printf("Longest repeated nucleotide: %d %c's ",
                          max, type);

    }
}
