package _5_Wildcards;

import java.util.Objects;

public class PersonWildcard {

    private final String name;
    private final int age;

    public PersonWildcard(String name, int age){
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
        PersonWildcard person = (PersonWildcard) o;
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