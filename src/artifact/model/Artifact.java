package artifact.model;

public class Artifact {
    int number;
    String culture;
    int age;

    public Artifact(int number) {
        this.number = number;
        this.culture = "Unknown";
    }

    public Artifact(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    public Artifact(int number, String culture, int age) {
        this.number = number;
        this.culture = culture;
        this.age = age;
    }

    public void print() {
        System.out.println("number = " + number);
        System.out.println("culture = " + culture);
        System.out.println("age = " + age);
    }
}
