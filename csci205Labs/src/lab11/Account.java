/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
/**
 *
 * @author as063
 */
public class Account {
    double balance;
    
    public Account(double initBalance) {
        double balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void credit(double amount){
        balance += amount;
    }
    
    public void debit(double amount) throws InsufficientFundsException{
        balance -= amount;
    }
    
    public void processCheck(Payable payee, double hoursBilled) throws InsufficientFundsException{
        
        System.out.println("Pay to:" + payee.getPayTo());
        System.out.println("Pay memo:" + " " + "Employee ID" + payee.getPayMemo()); 
        System.out.println("Pay amount" + payee.calculatePay(hoursBilled));
        System.out.println("Account Balance:" + balance);
        
    }

}
