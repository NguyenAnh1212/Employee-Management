package Controller;

import Model.Employee;
import Model.FulltimeEmployee;
import Model.ParttimeEmployee;

public class Method {
    // Hiển thị danh sách nhân viên.
    public static void displayEmployee(Employee[] employees){
        if(employees.length == 0){
            System.out.print("Nothing to see here...");
        }else{
            for (Employee e: employees
            ) {
                System.out.println(e);
            }
        }
    }


    // Thêm mới nhân viên vào danh sách.
    public static Employee[] addNewEmployee(Employee[] employees, Employee newEmployee){
        Employee[] newEmployeeList = new Employee[employees.length+1];
        for (int i = 0; i < employees.length; i++) {
            newEmployeeList[i] = employees[i];
        }
        newEmployeeList[employees.length] = newEmployee;
        return newEmployeeList;
    }

    // Liệt kê danh sách nhân viên fulltime có mức lương thấp hơn
    // mức lương trung bình của nhân viên trong công ty.
    public static void displayUnderAvgSalaryFulltimeEmployee(Employee[] employees){
        double SumSalary = 0;
        for (Employee e: employees
             ) {
            SumSalary += e.getNetSalary();
        }
        double AvgSalary = SumSalary/ employees.length;
        for (Employee e:employees
             ) {
            if(e instanceof FulltimeEmployee){
                if(e.getNetSalary() < AvgSalary){
                    System.out.println(e);
                }
            }
        }
    }
    // Tổng số lương phải trả cho nhân viên bán thời gian.
    public static double getSumSalaryParttimeEmployee(Employee[] employees){
        double SumSalary = 0;
        for (Employee e: employees
             ) {
            if (e instanceof ParttimeEmployee){
                SumSalary += e.getNetSalary();
            }
        }
        return SumSalary;
    }
}
