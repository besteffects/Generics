package _5_Wildcards;

import _2_Collections.Person;

import java.util.Objects;

public class PersonWild {

    private final String name;
    private final int age;

    public PersonWild (String name, int age){
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
        PersonWild person = (PersonWild) o;
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