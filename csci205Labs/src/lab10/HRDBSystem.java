/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Anushikha Sharma
 */
public class HRDBSystem {
    public static void main( String[] args) throws ParseException, ManagerException{
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
        ArrayList<Employee> empList = new ArrayList<>();


        System.out.println(emp_1);
        System.out.println(emp_2);
        System.out.println(emp_3);
        System.out.println(emp_4);
        System.out.println(emp_5);
        System.out.println(emp_6);
        System.out.println(mgr_1);
        System.out.println(mgr_2);
        
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
    }
}
