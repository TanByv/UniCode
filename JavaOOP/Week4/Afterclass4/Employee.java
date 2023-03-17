package JavaOOP.Week4.Afterclass4;

public class Employee {
    private String name;
    private int age;
    private double salary;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double calculateBonus() {
        if (salary < 50000) {
            return salary * 0.1;
        } else {
            return salary * 0.2;
        }
    }
}
