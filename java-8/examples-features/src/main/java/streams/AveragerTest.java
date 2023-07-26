package streams;

import java.util.ArrayList;
import java.util.List;

public class AveragerTest {

    public static void main(String[] args) {

        List<Person> roster = new ArrayList<>();
        roster.add(new Person("John", Person.Sex.MALE, 30));
        roster.add(new Person("Alice", Person.Sex.FEMALE, 25));
        roster.add(new Person("Bob", Person.Sex.MALE, 40));

        Averager averageCollect = roster.stream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .map(Person::getAge)
                .collect(Averager::new, Averager::accept, Averager::combine);

        System.out.println("Average age of male members: " +
                averageCollect.average());
    }
}
