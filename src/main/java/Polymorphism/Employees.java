package Polymorphism;

/**
 * Created by Samkele on 3/27/2016.
 */
public abstract class Employees implements PayableAmount{

    private String firstName;
    private String lastName;
    private String employeeNumber;

    public Employees(String firstName, String lastName, String employeeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String toString(){

    String message = String.format("Employee Full Name: %s %s\nEmployee Number: %s");
        return message;
    }
}
