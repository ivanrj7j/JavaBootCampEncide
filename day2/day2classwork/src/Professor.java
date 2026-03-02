public class Professor extends Person {
    private String department;

    public Professor(String name, String department) {
        // Demonstrate super()
        super(name);
        System.out.println("Professor constructor called");
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Smith", "Computer Science");
        prof.displayInfo();
    }
}
