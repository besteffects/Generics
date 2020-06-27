package _6_Raw_Types.c_implication_of_erasure;

public class InstanceOfExample<T> {
    public boolean equals(Object o) {
        if (o instanceof InstanceOfExample /* <T>*/) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new InstanceOfExample<>() instanceof InstanceOfExample);
    }
}
