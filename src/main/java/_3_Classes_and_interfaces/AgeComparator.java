package _3_Classes_and_interfaces;

import _2_Collections.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person left, Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }
}
