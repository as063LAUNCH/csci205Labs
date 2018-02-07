/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import static lab10.HRUtility.displayEmployee;
import static lab10.HRUtility.displayEmployees;

/**
 *
 * @author Anushikha Sharma
 */
public class HRUtility {
    private static SimpleDateFormat empDateFormat = new SimpleDateFormat(
            "yyyy-mm-dd");

    public static void displayEmployee(Employee emp) {
        if (emp instanceof Manager) {
            System.out.printf(
                    emp.getEmpID() + ": " + emp.getFirstName() + " " + emp.getLastName() + " [MANAGER] \n");
        } else {
            System.out.printf(
                    emp.getEmpID() + ": " + emp.getFirstName() + " " + emp.getLastName() + "\n");
        }
    }
        
    public static void displayEmployees(List<Employee> listOfEmps) {
        for (int i = 0; i < listOfEmps.size(); i++) {
            displayEmployee(listOfEmps.get(i));
        }
    }

    /**
     *
     * @param date the value of date
     */
    public static String dateToStr(Date date) {
        String reportDate = Employee.empDateFormat.format(date);
        return reportDate;
    }

    /**
     *
     * @param sDate the value of sDate
     * @throws ParseException
     */
    public static Date strToDate(String sDate) throws ParseException {
        return Employee.empDateFormat.parse(sDate);
    }
    
    /**
     * Prints out the manager and the list of employees under the manager
     *
     * @param mgr
     */
    public static void displayManager(Manager mgr) {
        System.out.println(
                "Manager:     " + mgr.getFirstName() + " " + mgr.getLastName());
        System.out.println("Department:  " + mgr.getDeptName());
        System.out.println("# Employees: " + mgr.getEmpList().size());
        displayEmployees(mgr.getEmpList());
        System.out.println("\n");
    }
    
}
    

