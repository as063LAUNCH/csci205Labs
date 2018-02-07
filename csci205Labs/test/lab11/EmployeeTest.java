/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.text.ParseException;
import lab11.HRUtility;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author as063
 */
public class EmployeeTest {
    static final double EPSILON = 1.0E-10;
    
    public EmployeeTest(){
    }
    public Employee instance;

    
    @Before
    public void setUp() throws ParseException{
        instance = new Employee(1, "Will", "Harris", 1010101011,
                HRUtility.strToDate("2010-10-08"), 150000);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEquals() throws ParseException {
        System.out.println("equals");
        Employee instance1 =  new Employee(1, "Anu", "Sha", 12345678, HRUtility.strToDate("2010-09-20"), 600000);
        assertFalse(instance.equals(instance1));
        Employee instance2 =  new Employee(1, "Syria", "War", 12345678, HRUtility.strToDate("2010-07-20"), 600000);
        assertFalse(instance.equals(instance2));   
    }

    /**
     * Test of changeName method, of class Employee.
     */
    @Test
    public void testChangeName() {
        System.out.println("changeName");
        assertEquals(instance.getFirstName(),"Will");
        assertEquals(instance.getLastName(),"Harris");
        
        instance.changeName("Adam", "Carl");
        assertEquals(instance.getFirstName(),"Adam");
        assertEquals(instance.getLastName(), "Carl");
    }
        
        
        

    /**
     * Test of raiseSalary method, of class Employee.
     */
    @Test
    public void testRaiseSalary() {
        System.out.println("raiseSalary");
        assertEquals(instance.getSalary(), 50,150000);
        double expResult = 2000;
        double result = instance.raiseSalary(500);
        assertEquals(expResult, result, 150000);
    }
    
    @Test
    public void testCalculatePay(){
        System.out.println("CalculatePay");
        double salary = 100;
        double expResult = 2;
        double result = instance.calculatePay(4160);
        assertEquals(expResult, result, EPSILON);
    
    }
    
}
