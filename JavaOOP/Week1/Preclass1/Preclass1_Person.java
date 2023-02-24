package JavaOOP.Week1.Preclass1;

public class Preclass1_Person {
    String name;
    int age;

    public Preclass1_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
