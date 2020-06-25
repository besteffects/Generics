package _3_Classes_and_interfaces.before;

import _2_Collections.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExamples {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 55);

        List<Person> madMen = new ArrayList<Person>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        System.out.println("Initial order: " + madMen);

        //Comparator defines the order according to which a list has to be sorted
        Collections.sort(madMen, new AgeComparator());

        System.out.println("After applying comparator (sorted by age): " + madMen);


        Collections.sort(madMen, new ReverseComparator<>(new AgeComparator()));

        System.out.println("After applying comparator (sorted by age): " + madMen);
    }
}
