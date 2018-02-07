/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author as063
 */
public class AccountTest {
    static final double EPSILON = 1.0E-10;
    private Account instance;
    private Account acc;
   
    
    public AccountTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of credit method, of class Account.
     */
    @Test
    public void testCredit() {
        System.out.println("credit");
        double amount = 50.0;
        double balance = 50.0;
        instance.credit(amount);
        Assert.assertEquals(100.0, acc.getBalance(),EPSILON);
    }

    /**
     * Test of debit method, of class Account.
     */
    @Test
    public void testDebit() throws Exception {
        System.out.println("debit");
        double amount = 0.0;
        acc.debit(500);
        Assert.assertEquals(1500.0, acc.getBalance(),EPSILON);
    }

    /**
     * Test of processCheck method, of class Account.
     */
    @Test
    public void testProcessCheck() throws Exception {
        System.out.println("processCheck");
        Payable payee = null;
        double hoursBilled = 0.0;
        Account instance = null;
        instance.processCheck(payee, hoursBilled);
    }
    
}
