package Model;

import Model.Employee;

public class ParttimeEmployee extends Employee {
    public static final int SALARYPERHOUR = 100;
    private double workHour;

    @Override
    public double getNetSalary() {
        double result = workHour* SALARYPERHOUR;
        return result;
    }

    public ParttimeEmployee(double workHour) {
        this.workHour = workHour;
    }

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(String employeeId, String fullName, int age, String phoneNumber, String email, double workHour) {
        super(employeeId, fullName, age, phoneNumber, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "EmployeeID:" + getEmployeeId()+
                "Full Name: " + getFullName()+
                "Age: " + getAge()+
                "Phone number: "+ getPhoneNumber()+
                "Email: "+ getEmail()+
                "workHour=" + workHour +
                '}';
    }
}
