public class ObjectOrientedPersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25, 1.70, 60.0, 'F', "Engineer");
        Person p2 = new Person("Bob", 30, 1.80, 70.0, 'M', "Doctor");
        Person p3 = new Person("Charlie", 35, 1.75, 80.0, 'M', "Teacher");
        Person p4 = new Person("David", 40, 1.85, 90.0, 'M', "Lawyer");
        Person p5 = new Person("Emma", 45, 1.65, 100.0, 'F', "Writer");

        System.out.println(p1.name + "\n" + p2.name + "\n" + p3.name + "\n" + p4.name + "\n" + p5.name);
    }
}