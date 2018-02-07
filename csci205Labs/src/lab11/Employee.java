/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11;
/**
 *
 * @author Anushikha Sharma
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import static lab11.Employee.dateToStr;


/**
 * A simple class to represent an Employee in a even simpler HR database
 *
 * @author brk009
 */
enum SortType {
    SORT_BY_LNAME("SORT_BY_LASTNAME"), SORT_BY_ID("SORT_BY_ID");

    private String label;

    SortType(String s) {
        this.label = s;
    }

    @Override
    public String toString() {
        return label;
    }

};

public class Employee implements Payable, Comparable<Employee> {
    static SimpleDateFormat empDateFormat = new SimpleDateFormat("yyyy-mm-dd");
    private static final HashSet<Integer> setOfIDs = new HashSet<>();
    private static SortType type = SortType.SORT_BY_ID;
    //private static SortType type1 = SortType.SORT_BY_LNAME;
    public static void setSortType(SortType new_type){
        Employee.type = new_type;
    }
    

    private int empID;
    private String firstName;
    private String lastName;
    private int ssNum;
    private Date hireDate;
    private double salary;

    /**
     * Explicit construct to create new employee
     *
     * @param empID
     * @param firstName
     * @param lastName
     * @param ssNum
     * @param hireDate
     * @param salary
     */
    public Employee(int empID, String firstName, String lastName, int ssNum, Date hireDate, double salary) {
        if (setOfIDs.contains(empID) || empID <= 0) {
            this.empID = generateID();
        } else {
            this.empID = empID;
            setOfIDs.add(empID);
        }
        this.empID = empID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssNum = ssNum;
        this.hireDate = hireDate;
        this.salary = salary;
        this.empDateFormat = empDateFormat;
       
    }
    public int getEmpID() {
        return empID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSsNum() {
        return ssNum;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }
    
    
    /**
     *
     * @param sDate the value of sDate
     * @throws ParseException
     */
    public static Date strToDate(String sDate) throws ParseException {
        return HRUtility.strToDate(sDate);
    }
  
    /**
     *
     * @param date the value of date
     */
    public static String dateToStr(Date date) {
        return HRUtility.dateToStr(date);
    }
          

    private static int generateID() {
        int i = 1;
        while (setOfIDs.contains(i) == true) {
            i++;
        }
        setOfIDs.add(i);
        return i;
    }
    
    
   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.ssNum != other.ssNum) {
            return false;
        }
        return true;
    }

    /**
     * Change the name of the employee
     *
     * @param first - New first name
     * @param last - New last name
     */
    public String changeName(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        return (this.firstName);
        
    }

    /**
     * Raise the salary by <code>salaryAdj</code> dollars.
     *
     * @param salaryAdj - amount to add to the current salary
     * @return the new salary
     */
    public double raiseSalary(double salaryAdj) {
        this.salary += salaryAdj;
        return this.salary;
    }

    /**
     * Return a string representation of the Employee
     *
     * @return the String of comma delimited values
     */
    @Override
    public String toString() {
        String s = this.empID + "," + this.lastName + "," + this.firstName;
        s += String.format(",%09d", this.ssNum);
        s += "," + this.hireDate;
        s += String.format(",%.2f", this.salary);
        s += dateToStr(this.hireDate);
        return s;
    }

    @Override
    public double calculatePay(double numHrs) {
        if (numHrs == 40){
            double gross = this.salary/(numHrs*52);
            return gross;
        }if (40 > numHrs){
            double num = 40 - numHrs; 
            double gross = (this.salary/(numHrs*52)) + 1.5*(this.salary/(numHrs*52));
            return gross;     
        }
        else{
            double gross = this.salary/numHrs;
            return gross; 
        }
        
    }

    @Override
    public String getPayTo() {
        String s = this.firstName;
        String t = this.lastName;
        return (s + ' ' + t);
        
    }

    @Override
    public String getPayMemo() {
        String s =  ' ' + getEmpID() + "," + "Pay Date:" + dateToStr(this.hireDate);
        return s;
    
    }
    
    

    @Override
    public int compareTo(Employee one) {
        if (type == SortType.SORT_BY_ID){
            if (this.getEmpID() < one.getEmpID()){
            return -1; 
            }if (this.getEmpID() < one.getEmpID()){
            return 1;
            }
            return 0;
        }else{
            return this.getLastName().compareToIgnoreCase(one.getLastName());
        }
    }
}
