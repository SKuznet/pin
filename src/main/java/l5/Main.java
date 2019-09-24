package l5;

public class Main {
//    Object
    // 1 byte
    byte aByte = 0;
    // 2 byte
    short aShort = 0;
    // 4 byte
    int anInt = 0;
    // 8 byte
    long aLong = 0;

    // 4 byte
    float aFloat = 0.0F;
    // 8 byte
    double aDouble = 0.0;
    // 2 byte
    char aChar = '\u0000';

    boolean aBoolean = false;

    public static void main(String[] args) {
        Ex3 ex3;
        int i = 0;
        System.out.println(i);
    }

    private short getSum(short val1, double val2) {
        return (short) (val1 + val2);
    }
}
