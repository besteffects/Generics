package _6_Raw_Types.a_raw_types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCodeGenerics {
    public static void main(String[] args) {
        List <Object> list = new ArrayList();
        list.add("abc");
        list.add(1);
        list.add(new Object());

        // list of strings isn't compatible with a list of objects
        // List<String> strings =list;

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        legacyMethod(integers);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final Object element = iterator.next();
            System.out.println(element);
        }
    }

    public static void legacyMethod(List list){

    }
}