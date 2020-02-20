/*
 * Anton dela Cruz
 * February 19, 2020
 * This program compares the square of the square root of any number. The difference in these values is due to the rounding error in Java.
 */
package roundingerror.commented;

import javax.swing.*;
/**
 *
 * @author antde
 */
public class RoundingErrorCommented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter a number"); // Window pops up and prompts for user input
        int userInput = Integer.parseInt(input);                             // Program converts string data to integer data
        double root = Math.sqrt(userInput);                                  // Calculated the square root of user input
        double sq = root * root;                                             // Squares roots of user input
        
        System.out.println("The square of the square: " + sq);
        System.out.println("The round off error: " + (userInput - sq));
    }
    
}
