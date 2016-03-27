package Inheritance;

/**
 * Created by Samkele on 3/27/2016.
 */
public class Salary implements Payable{

    private String firstName;
    private double salary;
    private String employeeNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public double getSalaryAmount(){
        return getSalary() * 40;
    }

}
