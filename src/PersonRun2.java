import java.util.Random;

public class PersonRun2 {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 20, "+37522");
        alex.print();
        alex.setAge(21);

        Person sam = new Person("Sam", 30, "+37533");
        sam.print();
        sam.setAge(21);

        Person.setNumber("333");
        System.out.println("Person.getNumber() = " + Person.getNumber());

        Person[] persons = new Person[10];
        Random r = new Random();
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person("" + i, r.nextInt(60));
        }
    }
}
