/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * author - Anushikha Sharma
 */
package lab10;

import java.text.ParseException;
import java.util.Date;
import static lab10.HRUtility.strToDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author as063
 */
public class EmployeeTest {
    private String emp;
    private Employee instance;
    static final double salary = 6000.0;
    public EmployeeTest() {
    }
    
    @Before
    public void setUp() throws ParseException {
        Employee emp = new Employee(1, "Will", "Harris", 1010101011,
                                      strToDate("2010-10-08"), 150000);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of equals method, of class Employee.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Employee sum = null;
        assertFalse(emp.equals(sum));
        sum = new Employee(1, "Anu", "Sha", 12345678, new Date(), 600000);
        assertFalse(emp.equals(sum));
        sum = new Employee(1, "Auk", "Sau", 12345678, new Date(), 600000);
        assertEquals(emp, sum);
        
    }

    /**
     * Test of changeName method, of class Employee.
     */
    public void testChangeName() {
        System.out.println("changeName");
        String expResult = "Anu";
        //String result = new changeName('Anu', "Shar");
        assertEquals(expResult, result);
    }

    /**
     * Test of raiseSalary method, of class Employee.
     */
    @Test
    public void testRaiseSalary() {
        System.out.println("raiseSalary");
        double salaryAdj = 50.0;
        double expResult = 6050.0;
        double result = salary + salaryAdj;
        assertEquals(expResult, result, salary);
    }

}
