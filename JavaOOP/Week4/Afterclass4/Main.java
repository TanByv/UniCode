package JavaOOP.Week4.Afterclass4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setAge(30);
        employee.setSalary(60000);
        System.out.println("Employee " + employee.getName() + " has a bonus of $" + employee.calculateBonus());
    }
}
