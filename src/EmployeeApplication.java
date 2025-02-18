public class EmployeeApplication 
{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Manager m = new Manager();
        Manager m1 = new Manager();
        e1.setName("John");
        e1.setSalary(20000);
        e1.employeeDetails();
        m.setBonus(0);
        m.isBonusGranted();
        m.setName("Sita");
        m.setSalary(80000);
        m.employeeDetails();
       // m.setBonus(9);
       // m.isBonusGranted();
        m1.setName("Ishi");
        m1.setSalary(50000);
        m1.employeeDetails();
        m1.setBonus(90);
        m1.isBonusGranted();

    }
}
