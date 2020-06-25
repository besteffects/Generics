package _4_Methods;

import _2_Collections.Person;
import _3_Classes_and_interfaces.before.AgeComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExamples<T> {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);
        final Person youngestCastMember = (Person) min(madMen, new AgeComparator());

        System.out.println(youngestCastMember);
    }

    public static Object min(List values, Comparator comparator) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }
        Object lowestElement = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            final Object element = values.get(i);
            //if a currently seen element is lest than a lowest element
            if (comparator.compare(element, lowestElement) < 0) {
                lowestElement = element;
            }
        }
        return lowestElement;
    }

}
