/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2016
 *
 * Name: Anushikha Sharma
 * Date: Feb 13, 2016
 * Time: 12:53:20 PM
 *
 * Project: csci205_
 * Package: lab08
 * File: CoinCollectionClient
 * Description:
 *
 * ****************************************
 */
package lab08;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author as063
 */
public class CoinCollectionClient {
    enum AddRemoveChoices {
        DONE("Done"), REMOVE("Remove Coins"), ADD("Add Coins");
        private final String label;

        AddRemoveChoices(String s) {
            this.label = s;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    public static void main(String args[]) {
        CoinCollection myCoins = new CoinCollection();
        myCoins.addCoins(Coin.NICKEL,
                         5);
        myCoins.addCoins(Coin.DIME,
                         3);
        myCoins.addCoins(Coin.QUARTER,
                         7);
        int add;
        int rem;
        JFrame addFrame = new JFrame("Add Coins");
        JFrame remFrame = new JFrame("Remove Coins");

        //String input;
        Coin input;
        while (true) {
            int result;
            result = JOptionPane.showOptionDialog(null, myCoins, "Add or Remove",
                                                  0, 0, null,
                                                  AddRemoveChoices.values(),
                                                  AddRemoveChoices.ADD);
            //Select drop down option

            if (result == AddRemoveChoices.DONE.ordinal()) {
                break;
            } else if (result == AddRemoveChoices.ADD.ordinal()) {
                input = (Coin) JOptionPane.showInputDialog(null,
                                                           "Select coin type",
                                                           "Coin Selection",
                                                           JOptionPane.QUESTION_MESSAGE,
                                                           null,
                                                           Coin.values(), // Array of choices
                                                           Coin.values()[0]);

                add = Integer.parseInt(JOptionPane.showInputDialog(addFrame,
                                                                   "How much do you want to add?"));
                myCoins.addCoins(input, add);

            } else if (result == AddRemoveChoices.REMOVE.ordinal()) {
                input = (Coin) JOptionPane.showInputDialog(null,
                                                           "Select coin type",
                                                           "Coin Selection",
                                                           JOptionPane.QUESTION_MESSAGE,
                                                           null,
                                                           Coin.values(), // Array of choices
                                                           Coin.values()[0]);

                rem = Integer.parseInt(JOptionPane.showInputDialog(remFrame,
                                                                   "How much do you want to remove? Max = 13"));
                myCoins.removeCoins(input, rem);

            }
        }
        JOptionPane.showConfirmDialog(null, myCoins, "Goodbye",
                                      JOptionPane.DEFAULT_OPTION);
    }
}
