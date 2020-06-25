package _5_Wildcards;

public class Employee extends PersonWild {
    public Employee(final String name, final int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
