public class PersonRun {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 20, "+37522");
        alex.sayHello();

        Person sam = new Person("Sam", 30);
        sam.sayHello();

        alex = sam;
        alex.sayHello();

        boolean samOlderThan20 = sam.isOlderThan(40);
        System.out.println("samOlderThan20 = " + samOlderThan20);

        System.out.println("---------");
        sam.print();

        alex = null;
//        alex.sayHello();//NullPointer
    }
}
