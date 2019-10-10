package l5;

public interface AnimalInterface {
    public static final int i = 5;



    static String getName() {
        return "Barsik";
    }

    default void getVal2() {
        System.out.println("I am from interface");
    }
}
