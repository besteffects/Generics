package _2_Collections;

import javax.print.DocFlavor;
import java.util.Objects;

public class Person {

    private final String name;
    private final int age;

    public Person (String name, int age){
        Objects.requireNonNull(name);
        this.name=name;
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
