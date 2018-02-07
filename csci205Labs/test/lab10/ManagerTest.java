/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * author - Anushikha Sharma
 */
package lab10;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author as063
 */
public class ManagerTest {
    private final ArrayList<Employee> empList = new ArrayList<>();
    
    public ManagerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addEmployee method, of class Manager.
     * @throws java.lang.Exception
     */
    @Test
    public void testAddEmployee() throws Exception {
        Employee emp_1 = new Employee(1, "Will", "Harris", 1010101011,
                                     HRUtility. strToDate("2010-10-08"), 150000);
        Employee emp_2 = new Employee(2, "Darak", "Seer", 1010101012,
                                     HRUtility.strToDate("2017-10-08"), 150000);
        Employee emp_3 = new Employee(201, "Keith", "Buffington", 1010101013,
                                      HRUtility.strToDate("2010-10-08"), 150000);
        empList.add(emp_1);
        empList.add(emp_2);
        empList.add(emp_2);
        assertTrue((empList.size() == 3));
        
    }

    /**
     * Test of getEmpList method, of class Manager.
     */
    @Test
    public void testGetEmpList() {
        System.out.println("getEmpList");
        ArrayList<Employee> run = new ArrayList<>();
       // assertFalse(emp.GetEmpList().equals(run));
    }

    /**
     * Test of removeEmployee method, of class Manager.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemoveEmployee() throws Exception {
        Employee emp_1 = new Employee(1, "Will", "Harris", 1010101011,
                                     HRUtility. strToDate("2010-10-08"), 150000);
        Employee emp_2 = new Employee(2, "Darak", "Seer", 1010101012,
                                     HRUtility.strToDate("2017-10-08"), 150000);
        Employee emp_3 = new Employee(201, "Keith", "Buffington", 1010101013,
                                      HRUtility.strToDate("2010-10-08"), 150000);
        empList.remove(emp_1);
        empList.remove(emp_2);
        
        assertFalse((empList.size() == 1));    
        
    }
    
    /**
     *
     * @param message
     * @throws lab10.ManagerException*/
     
    @Test
    public void testAddEmployeeException() throws ManagerException{
        }
        

   @Test
    public void testRemoveEmployeeException() throws ManagerException{
        }
        
   
    
}
