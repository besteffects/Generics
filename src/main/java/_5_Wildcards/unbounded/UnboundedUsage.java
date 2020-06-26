package _5_Wildcards.unbounded;

import _5_Wildcards.bounded.PersonWildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundedUsage {
    public static void main(String[] args) throws ClassNotFoundException
    {
        List<Object> objects = new ArrayList<>();
        objects.add(new Object());
        objects.add(new PersonWildcard("Don Draper", 89));
        System.out.println(objects);

        // Its only safe to add null to a List<?>
       // ? extends Object, we don't know which class we are using
        List<?> wildcards = new ArrayList<>();
        wildcards.add(null);
        System.out.println(wildcards);
    }
}
