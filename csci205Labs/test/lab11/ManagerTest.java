/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * author - Anushikha Sharma
 */
package lab11;

import java.text.ParseException;
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
    
    
    public ManagerTest() {
        ArrayList<Employee> empList = new ArrayList<>();
    }
    public Manager mgr;
    public ArrayList<Employee> empList = new ArrayList<>();
    @Before
    public void setUp() throws ParseException, ManagerException{
        mgr = new Manager(0, "Brian", "King", 1234546789, HRUtility.strToDate("2010-10-09"), 60000,
                                    "HR");
        Employee emp_1 = new Employee(1, "Will", "Harris", 1010101011,
                                     HRUtility. strToDate("2010-10-08"), 150000);
        Employee emp_2 = new Employee(2, "Darak", "Seer", 1010101012,
                                     HRUtility.strToDate("2017-10-08"), 150000);
        Employee emp_3 = new Employee(201, "Keith", "Buffington", 1010101013,
                                      HRUtility.strToDate("2010-10-08"), 150000);
        Employee emp_4 = new Employee(4, "Karen", "Marosi", 1010101014,
                                      HRUtility.strToDate("2010-10-08"), 150000);
        Employee emp_5 = new Employee(0, "Syria", "War", 1010101015,
                                      HRUtility.strToDate("2011-10-98"), 150000);
        Employee emp_6 = new Employee(200, "Sheila", "Gupta", 1010101410,
                                      HRUtility.strToDate("2020-10-08"), 150000);
        
        empList.add(emp_1);
        empList.add(emp_2);
        empList.add(emp_3);
        empList.add(emp_4);
        empList.add(emp_5);
        empList.add(emp_6);
        
        mgr.addEmployee(emp_1);
        mgr.addEmployee(emp_2);
        mgr.addEmployee(emp_3);
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addEmployee method, of class Manager.
     * @throws java.lang.Exception
     */
    @Test
    public void testAddEmployee() throws ManagerException {
        System.out.println("addEmployee");
        assertEquals(mgr.getEmpList().size(), 3);

        mgr.addEmployee(empList.get(3));
        mgr.addEmployee(empList.get(4));
        mgr.addEmployee(empList.get(5));

        assertEquals(mgr.getEmpList().size(), 6);
        assertEquals(mgr.getEmpList(), empList);
        
        
    }

    /**
     * Test of getEmpList method, of class Manager.
     */
    @Test
    public void testGetEmpList() throws ParseException {
        System.out.println("getEmpList");

        ArrayList<Employee> expected = new ArrayList<>();
        Employee emp_1 = new Employee(1, "Will", "Harris", 1010101011,
                                     HRUtility. strToDate("2010-10-08"), 150000);
        
        Employee emp_2 = new Employee(2, "Darak", "Seer", 1010101012,
                                     HRUtility.strToDate("2017-10-08"), 150000);
        Employee emp_3 = new Employee(201, "Keith", "Buffington", 1010101013,
                                      HRUtility.strToDate("2010-10-08"), 150000);
        
        

        expected.add(emp_1);
        expected.add(emp_2);
        expected.add(emp_3);

        assertEquals(mgr.getEmpList(), expected);
        
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
     * @throws lab11.ManagerException*/
     
    @Test
    public void testAddEmployeeException() throws Exception{
        System.out.println("addEmployeeException");
        assertEquals(mgr.getEmpList().size(), 3);

        mgr.addEmployee(empList.get(1));
        }
        

   @Test
    public void testRemoveEmployeeException() throws Exception{
        System.out.println("removeEmployeeException");
        assertEquals(mgr.getEmpList().size(), 3);

        mgr.removeEmployee(empList.get(4));
        }
        
   
    
}
