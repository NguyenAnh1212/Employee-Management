package Model;

public class FulltimeEmployee extends Employee {
    private int bonus;
    private int finemoney;
    private int baseSalary;

    @Override
    public double getNetSalary() {
        double result = baseSalary + (bonus - finemoney);
        return result;
    }

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int bonus, int finemoney, int baseSalary) {
        this.bonus = bonus;
        this.finemoney = finemoney;
        this.baseSalary = baseSalary;
    }

    public FulltimeEmployee(String employeeId, String fullName, int age, String phoneNumber, String email, int bonus, int finemoney, int baseSalary) {
        super(employeeId, fullName, age, phoneNumber, email);
        this.bonus = bonus;
        this.finemoney = finemoney;
        this.baseSalary = baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFinemoney() {
        return finemoney;
    }

    public void setFinemoney(int finemoney) {
        this.finemoney = finemoney;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "EmployeeID:" + getEmployeeId()+
                "Full Name: " + getFullName()+
                "Age: " + getAge()+
                "Phone number: "+ getPhoneNumber()+
                "Email: "+ getEmail()+
                "bonus=" + bonus +
                ", finemoney=" + finemoney +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
