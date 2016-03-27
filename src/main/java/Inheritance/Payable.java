package Inheritance;

/**
 * Created by Samkele on 3/27/2016.
 */
public interface Payable {

    void setFirstName(String firstName);
    void setSalary(double salary);
    void setEmployeeNumber(String employeeNumber);
    String getFirstName();
    double getSalary();
    String getEmployeeNumber();
    double getSalaryAmount();

}
