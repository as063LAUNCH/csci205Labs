/* Anushikha Sharma
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
/**
 *
 * @author Anushikha Sharma
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


enum DeptType {
    ENGINEERING("ENGINEERING"), HR("HR"), STAFF("STAFF"), ADMIN("ADMIN"), OTHER(
            "OTHER");

    private String label;

    DeptType(String s) {
        this.label = s;
    }

    @Override
    public String toString() {
        return label;
    }

};

public class Manager extends Employee {
    
    public Manager(int empID, String firstName, String lastName, int ssNum,
                   Date hireDate, double salary, String dept) {
        super(empID, firstName, lastName, ssNum, hireDate, salary);
        this.dept = DeptType.valueOf(dept);
    }
    private DeptType dept;

    public Manager(int empID, String firstName, String lastName, int ssNum,
                   Date hireDate, double salary, DeptType dept) {
        super(empID, firstName, lastName, ssNum, hireDate, salary);
        this.dept = dept;
    }
    /**
     * Get the value of deptName
     *
     * @return the value of deptName
     */
    public String getDeptName() {
        return this.dept.toString();
    }

    /**
     * Set the value of deptName
     *
     * @param dept
     */
    public void setDeptName(String dept) {
        this.dept = DeptType.valueOf(dept);
    }


    public DeptType getDept() {
        return this.dept;
    }

    public void setDept(DeptType new_dept) {
        this.dept = new_dept;
    }

    
    @Override
    public String toString() {
        return super.toString() + ",MANAGER," + this.getDeptName();
    }

    private ArrayList<Employee> empList = new ArrayList<>();

    public void addEmployee(Employee emp) throws ManagerException {
        if (empList.contains(emp)) {
            throw new ManagerException(String.format("Employee already exists"));
        } else {
            empList.add(emp);
        }
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void removeEmployee(Employee emp) throws ManagerException {
        if (empList.contains(emp) == false) {
            throw new ManagerException(String.format("Employee not found"));
        } else {
            empList.remove(emp);
        }
    }


}

