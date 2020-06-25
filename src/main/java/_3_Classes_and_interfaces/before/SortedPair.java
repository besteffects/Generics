package _3_Classes_and_interfaces.before;
//Comparable compares with yourself. Use it if you want to restrict

public class SortedPair <T extends Comparable<T>> {
    private final T first;
    private final T second;

    public SortedPair(T left, T right){
        if (left.compareTo(right)<0) {
            first = left;
            second = right;
        }
        else {
            first=right;
            second=left;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
