public class Person {
    String name = null;
    int age = 0;
    String phone;

    Person() {}

    Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    Person(String newName, int newAge, String newPhone) {
        name = newName;
        age = newAge;
        phone = newPhone;
    }

    void sayHello() {
        System.out.println("Hello I'm " + name);
    }

    boolean isOlderThan(int otherAge) {
        if (age > otherAge) {
            return true;
        } else {
            return false;
        }
    }

    void print() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("phone = " + phone);
    }
}
