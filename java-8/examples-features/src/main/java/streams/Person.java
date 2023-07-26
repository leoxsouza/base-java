package streams;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private Sex gender;
    private int age;

    public Person(String name, Sex gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Sex getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}