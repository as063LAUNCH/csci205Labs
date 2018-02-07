/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Anushikha Sharma
 */
public class HRDBSystem {
    public static void main( String[] args) throws ParseException, ManagerException, lab11.ManagerException{
        Manager mgr_1 = new Manager(0, "Brian", "King", 1234546789, HRUtility.strToDate("2010-10-09"), 60000,
                                    "HR");
        Manager mgr_2 = new Manager(1, "Sam", "Jacob", 1010101010,
                                    HRUtility.strToDate("2016-10-08"), 150000,
                                    "ENGINEERING");
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
        Contractor cont1 = new Contractor(73, "Builder", "Bob", 1010101410,
                                      30.0);
        Contractor cont2 = new Contractor(73, "Builder", "Wendy", 1010221410,
                                      40.0);
        ArrayList<Employee> empList = new ArrayList<>();
        // Create an account
        

        System.out.println(emp_1);
        System.out.println(emp_2);
        System.out.println(emp_3);
        System.out.println(emp_4);
        System.out.println(emp_5);
        System.out.println(emp_6);
        System.out.println(mgr_1);
        System.out.println(mgr_2);
        System.out.println(cont1);
        System.out.println(cont2);
        
        HRUtility.displayEmployees(empList);
        empList.add(emp_1);
        empList.add(emp_2);
        empList.add(emp_3);
        empList.add(emp_4);
        empList.add(emp_5);
        empList.add(emp_6);
        mgr_1.addEmployee(emp_1);
        mgr_1.addEmployee(emp_3);
        mgr_1.addEmployee(emp_2);

        mgr_2.addEmployee(emp_4);
        mgr_2.addEmployee(emp_5);
        mgr_2.addEmployee(emp_6);
        
        HRUtility.displayManager(mgr_1);
        HRUtility.displayManager(mgr_2);
        
        Employee instance = new Employee(201, "Keith", "Buffington", 1010101013,
                                      HRUtility.strToDate("2010-10-08"), 150000);
        double result = instance.raiseSalary(500);
        instance.changeName("Adam", "Carl");
       
        
       Account acc = new Account(2000.0);
        System.out.println(acc);
        // Test out a couple of payments, intentionally throwing an exception
        // with the second payment
        try {
            System.out.println("TEST: Printing a check to employee id: "
                    + empList.get(0).getEmpID());
            acc.processCheck(empList.get(0), 50); // 40 hrs + 10 hrs overtime
            System.out.println("TEST: Printing a check to contractor id: "
                    + cont1.getId());
            acc.processCheck(cont1, 35);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        // Verify that funds were debited from the account
        System.out.println(acc);
        
        
        System.out.println("*** Employees BEFORE SORT ***");
        HRUtility.displayEmployees(empList);
        System.out.println("*** Employees AFTER SORT_BY_LASTNAME ***");
        Employee.setSortType(SortType.SORT_BY_LNAME);
        Collections.sort(empList);
        HRUtility.displayEmployees(empList);
        System.out.println("*** Employees AFTER SORT_BY_ID ***");
        Employee.setSortType(SortType.SORT_BY_ID);
        Collections.sort(empList);
        HRUtility.displayEmployees(empList);
    }
}
