package guru.qa;

public class Main {

    //целые числа
    byte byteVar;
    short aShort;
    int anInt;
    long aLong;

    //floating point
    double aDouble = 1.23;
    float aFloat;

    //logical
    boolean aBoolean = true;

    //char
    char aChar;


    Proletarian proletarian;

    public static void main(String[] args) {
        Proletarian proletarian = new Proletarian();

        proletarian.born();

        proletarian.country();

        Fist fist = new Fist();
        fist.name = "Ivan";
        fist.age = 31;

        Fist anotherFist = new Fist();
        anotherFist.name = "Boris";
        anotherFist.age = 31;

        Human.country = "England";

        System.out.println(fist.name);
        System.out.println(fist.age);
        fist.noFart();

    }


}
