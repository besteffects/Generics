package _6_Raw_Types.d_arrays;

import java.util.AbstractList;
import java.util.List;

public class CustomArrayListGeneric<T> extends AbstractList<T> {

    private Object[] values;

    public CustomArrayListGeneric() {
        values = new Object[0];

    }

    public T get(final int index) {
        return (T) values[index];
    }

    public boolean add(final T o) {

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
      //  Object[] array = new String[3];
       // Integer[] otherArray = (Integer[]) array;

        List<Integer> arrayList = new CustomArrayListGeneric<>();

        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
    }
}
