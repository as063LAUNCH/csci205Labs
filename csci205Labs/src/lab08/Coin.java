/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2016
 *
 * Name: Anushikha Sharma
 * Date: Feb 13, 2016
 * Time: 11:22:59 AM
 *
 * Project: csci205_
 * Package: lab08
 * File: Coin
 * Description:
 *
 * ****************************************
 */
package lab08;

/**
 * Coin - A simple enumerated type to represent the different types of coins
 *
 * @author Anushikha Sharma
 *
 */
public enum Coin {
    NICKEL(0.05),
    DIME(0.10),
    QUARTER(0.25),
    PENNY(0.01),
    DOLLAR(1);

    private final double value;

    Coin(double value) {
        this.value = value;
    }

    double getValue() {
        return this.value;
    }
}
