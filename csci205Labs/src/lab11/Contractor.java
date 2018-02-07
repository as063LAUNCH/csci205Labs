/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Date;
import static lab11.Employee.dateToStr;

/**
 *
 * @author as063
 */
public class Contractor implements Payable{
    private int id;
    private String firstName;
    private String lastName;
    private int ssNum;
    private double hourlyRate;
    private Date hireDate;
    private double salary;
    
  
    public Contractor(int id, String firstName, String lastName, int ssNum, double hourlyRate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssNum = ssNum;
        this.hourlyRate = hourlyRate;
        this.salary = salary;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSsNum() {
        return ssNum;
    }

    public void setSsNum(int ssNum) {
        this.ssNum = ssNum;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    

    @Override
    public double calculatePay(double numHrs) {
        double gross = numHrs * hourlyRate;
        return gross;
    }

    @Override
    public String getPayTo() {
        String s = this.firstName;
        String t = this.lastName;
        return (s + ' ' + t);
        
    }

    @Override
    public String getPayMemo() {
        String s = "Contractor ID" + this.id + "," + "Pay Date:" + dateToStr(this.hireDate);
        return s;
        
    }
    
    
}
