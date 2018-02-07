/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author as063
 */
public interface Payable {

    /**
     * Represents the amount of money the check would be written for
     * returns a double representing the amount of money that should be paid for the number of hours
     * @param numHrs 
     */
    public double calculatePay(double numHrs);
    
    
    
    /**
     * return a	string that should be in the getPayTo field
     * Check if it is printed
     */
    public String getPayTo();
    
    
    /**
     * return a string that is placed in the memo field of the check
     */
    public String getPayMemo();
   
}
