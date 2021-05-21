package guru.qa;

public class Human {

    static String country = "CCCP";

    String name;
    int age;

    public Human(String name) {
        this.name = name;
    }

    void born(){
        System.out.println("I'm born");
    }

    void sayCitezenship(){
        System.out.println(country);
    }

}
