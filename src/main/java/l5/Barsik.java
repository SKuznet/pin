package l5;

public class Barsik extends Cat implements CatInterface, AnimalInterface {
    public static void main(String[] args) {
        System.out.println(AnimalInterface.getName());
        Barsik barsik = new Barsik();
        barsik.getVal();
        Cat cat = new Cat() {
            @Override
            public void getInfo() {

            }

            @Override
            public void getInfo1() {

            }
        };
//        Cat cat3 = new Anonymous();
        Cat cat2 = new Barsik();
    }

    @Override
    public void getInfo() {

    }

    @Override
    public void getInfo1() {

    }

    @Override
    public void getSound() {

    }
}
