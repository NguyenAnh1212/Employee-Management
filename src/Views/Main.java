package Views;

import Controller.Method;
import Model.Employee;
import Model.ParttimeEmployee;

import java.util.Scanner;

public class Main {
    public static Employee[] employees;
    public static void main(String[] args) {

        employees = new Employee[0];
//        Employee hieu = new ParttimeEmployee("CG01","Hiếu",20,
//                "0123456789", "Hieu95@gmail.com", 2.5 );
//        Employee hieu = creatNewEmployee();
//        employees = Method.addNewEmployee(employees, hieu);
        Method.displayEmployee(employees);
    }
    //Phương thức thêm mới nhân viên.
    public static Employee creatNewEmployee(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employeeID:");
        String employeeId = scanner.nextLine();

        System.out.println("Enter fullname:");
        String fullName = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        System.out.println("Enter work hour:");
        double workHour = scanner.nextDouble();

        System.out.println("Enter bonus:");
        int bonus = scanner.nextInt();

        System.out.println("Enter fineMoney:");
        int fineMoney = scanner.nextInt();

        System.out.println("Enter base salary:");
        int baseSalary = scanner.nextInt();

        Employee employee = new ParttimeEmployee(employeeId, fullName, age, phoneNumber, email, workHour);
        return employee;
    }
}
