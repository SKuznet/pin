package l5;

public interface CatInterface {
    default void getVal() {
        System.out.println("I am from another interface");
    }

    void getSound();
}
