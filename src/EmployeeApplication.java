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
       // m.setBonus(9); //the first setBonus is taken 
        m.isBonusGranted();
        m1.setName("Ishi");
        m1.setSalary(50000);
        m1.employeeDetails();
        m1.setBonus(90);
        m1.isBonusGranted();
        Teamlead t =new Teamlead();
        t.setName("Rob");
        t.setSalary(6000);
        t.employeeDetails();
        t.setBonus(9);
        t.isBonusGranted();
        t.setTeamsize(0);
        t.teamMembers();

    }
}
