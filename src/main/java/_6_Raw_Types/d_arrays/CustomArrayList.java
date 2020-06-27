package _6_Raw_Types.d_arrays;

import java.util.AbstractList;
import java.util.List;

public class CustomArrayList extends AbstractList {

    private Object[] values;

    public CustomArrayList() {
        values = new Object[0];

    }

    public Object get(final int index) {
        return values[index];
    }

    public boolean add(final Object o) {

        Object[] newValues = new Object[size() + 1];
        for (int i = 0; i < size(); i++) {
            newValues[i] = values[i];
        }
        newValues[size()] = o;
        values = newValues;
        return true;
    }

    public int size() {
        return values.length;
    }

    public static void main(String[] args) {

        //this will cause runtime error
//        String [] strings= new String[3];
//    Object[] objects =strings;
//    objects[0]=1;


//ClassCastException
        //Object[] array = new String[3];
        //Integer[] otherArray = (Integer[]) array;

        List arrayList = new CustomArrayList();

        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
    }
}
