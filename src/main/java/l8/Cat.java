package l8;

public class Cat implements AnimalInterface, CatInterface {
    @Override
    public String getInfo(String name) {
        return null;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getName2();
        cat.getEat();
    }

    @Override
    public void getName2() {

    }
}
