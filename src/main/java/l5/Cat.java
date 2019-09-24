package l5;

public abstract class Cat {
    private String name;
    private int age;

    public abstract void getInfo();

    public abstract void getInfo1();

    public void getMove() {
        System.out.println("I am walking...");
    }
}
