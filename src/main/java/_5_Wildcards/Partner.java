package _5_Wildcards;

public class Partner extends PersonWildcard {


    public Partner(final String name, final int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Partner{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
