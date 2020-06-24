package _2_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);

        List<Person> madMen = new ArrayList<Person>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        final Iterator<Person> iterator = madMen.iterator();

        System.out.println("Print with Iterator");
        while (iterator.hasNext()) {
            final Person person = iterator.next();
            System.out.println(person);
        }

        madMen.add(new Person("Bert Cooper", 100));

        System.out.println(madMen);
        System.out.println(madMen.size());

        System.out.println(madMen.get(0));

        for (int i = 0; i < madMen.size(); i++) {
            final Person person = madMen.get(i);
            System.out.println(person);
        }

        System.out.println("Print with for each: ");
        for (Person person : madMen
        ) {
            System.out.println(person);

        }
    }
}
