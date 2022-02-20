import Model.Employee;

public class Method {
    public static void displayEmployee(Employee[] employees){
        for (Employee e: employees
             ) {
            System.out.println(e);
        }
    }
    public static Employee[] addNewEmployee(Employee[] employees, Employee newEmployee){
        // Khai báo mảng mới có số độ dài mảng lớn hơn mảng ban đầu.
        Employee[] newEmployeeList = new Employee[employees.length+1];
        // Copy mảng cũ sang mảng mới.
        for (int i = 0; i < employees.length; i++) {
            newEmployeeList[i] = employees[i];
        }
        // Gán nhân viên mới và phần tử cuối.
        newEmployeeList[employees.length] = newEmployee;
        return newEmployeeList;

    }

}
