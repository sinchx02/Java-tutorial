public class Employee 
{
    private String name;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void employeeDetails()
    {
        System.out.println("Name "+getName()+" Salary "+getSalary());
    }
    
}
