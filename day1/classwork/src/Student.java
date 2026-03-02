public class Student {
    String name;
    int age;

    // Default Constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Student(String name, int age) {
        // Intentionally shadow variables to show how this.name resolves it
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Instantiate using 'new'
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);

        s1.displayInfo();
        s2.displayInfo();
    }
}
