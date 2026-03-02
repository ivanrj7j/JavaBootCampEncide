public class Person {
    protected String name;

    public Person(String name) {
        System.out.println("Person constructor called");
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}
