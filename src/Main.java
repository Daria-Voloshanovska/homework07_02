
import java.util.*;


public class Main {
    public static void main(String[] args) {

Person[] people = {
        new Person("Alice", 30),
        new Person("John", 38),
        new Person("Bob", 42),
        new Person("Mike", 24)
};

        System.out.println("Before sorting:");
        Person.printPeople(people);

        Person.bubbleSort(people);
        System.out.println("After sorting (in descending order of age):");
        Person.printPeople(people);

    }
}