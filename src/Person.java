public class Person {
    private String name = null;
    private int age = 0;
    private String phone;

    private static String number = "110";

    public Person() {}

    public Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public Person(String newName, int newAge, String newPhone) {
        name = newName;
        age = newAge;
        phone = newPhone;
    }

    public void sayHello() {
        System.out.println("Hello I'm " + name);
    }

    public boolean isOlderThan(int otherAge) {
        if (age > otherAge) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("phone = " + phone);
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static String getNumber() {
        return number;
    }

    public static void setNumber(String num) {
        number = num;
    }
}
