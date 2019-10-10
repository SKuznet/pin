package l8;

public interface AnimalInterface {
    default void getName2(){
        System.out.println("I am from interface2");
    }

    default void getEat() {
        System.out.println("I am eating...");
    }
}
