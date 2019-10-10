package l8;

@FunctionalInterface
public interface CatInterface {
    static void getName(){
        System.out.println("I am Barsik");
    }

    default void getName2(){
        System.out.println("I am from interface");
    }

    public abstract String getInfo(String name);
}
