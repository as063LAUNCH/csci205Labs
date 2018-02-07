/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

/**
 *
 * @author anushikha.sharma
 */
public class CashRegisterTest {
    static final double EPSILON = 1.0E-12;
    private CashRegister instance;
    
    public CashRegisterTest() {
    }
    
    @Before
    public void setUp() {
        instance = new CashRegister();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }
    

    /**
     * Test of getPurchaseCount method, of class CashRegister.
     */
    @Test
    public void testGetPurchaseCount() {
        System.out.println("getPurchaseCount");
        //CashRegister instance = new CashRegister();
        //Test the inital state = should have NO items
        assertEquals(0, instance.getPurchaseCount());
        
        //now set up a test of two items
        instance.scanItem(0.55);
        instance.scanItem(1.27);
        int expResult = 2;
        int result = instance.getPurchaseCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListOfPurchases method, of class CashRegister.
     */
    @Test
    public void testGetListOfPurchases() {
        System.out.println("getListOfPurchases");
        //CashRegister instance = new CashRegister();
        List<Double> expResult;
        expResult = new LinkedList<>();
        assertEquals(expResult, instance.getListOfPurchases());
        instance.scanItem(0.55);
        instance.scanItem(1.27);
        
        expResult.add(0.55);
        expResult.add(1.27);
     
        List<Double> result = instance.getListOfPurchases();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTransactionTotal method, of class CashRegister.
     */
    @Test
    public void testGetTransactionTotal() {
        System.out.println("getTransactionTotal");
        //CashRegister instance = new CashRegister();
        assertEquals(0, instance.getTransactionTotal(),EPSILON);
        //Now, set up a test of 2 items
        instance.scanItem(0.55);
        instance.scanItem(1.27);
        double expResult = 1.82;
        double result = instance.getTransactionTotal();
        assertEquals(expResult, result, EPSILON);
    }

    /**
     * Test of getPaymentCollected method, of class CashRegister.
     */
    @Test
    public void testGetPaymentCollected() {
        System.out.println("getPaymentCollected");
        //CashRegister instance = new CashRegister();
        assertEquals(0, 0.0, instance.getPaymentCollected());
        instance.scanItem(0.55);
        instance.scanItem(1.27);
        double expResult = 1.82;
        double result = instance.getPaymentCollected();
        assertEquals(expResult, result, 1.82);
    }

    /**
     * Test of collectPayment method, of class CashRegister.
     */
    @Test
    public void testCollectPayment() {
        System.out.println("collectPayment");
        Money moneyType = Money.QUARTER;
        int unitCount = 0;
        //CashRegister instance = new CashRegister();
        instance.collectPayment(moneyType, unitCount);
    }

    /**
     * Test of giveChange method, of class CashRegister.
     */
    @Test
    public void testGiveChange() throws Exception {
        System.out.println("giveChange");
        //CashRegister instance = new CashRegister();
        assertEquals(0.0, instance.giveChange(), EPSILON);
        instance.scanItem(0.55);
        instance.scanItem(1.27);
        double expResult = 0.18;
        instance.collectPayment(Money.QUARTER, 8);
        double result = instance.giveChange();
        assertEquals(expResult, result, EPSILON);
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testScanItemLowException(){
        //CashRegister instance = new CashRegister();
        instance.scanItem(-0.5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testScanItemHighException(){
        //CashRegister instance = new CashRegister();
        instance.scanItem(1E6);
    }
    
    @Test(expected = ChangeException.class)
    public void testGiveChangeException()throws ChangeException{
        //CashRegister instance = new CashRegister();
        instance.scanItem(0.55);
        instance.scanItem(1.27);
        instance.giveChange();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void CollectPaymentException(){
        //CashRegister instance = new CashRegister();
        instance.scanItem(-6);
    }
    /**
     * Test of main method, of class CashRegister.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CashRegister.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}



