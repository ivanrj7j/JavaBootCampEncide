class GradeCalculator {
    protected String studentName;

    public GradeCalculator(String studentName) {
        this.studentName = studentName;
        System.out.println("GradeCalculator constructor called for: " + studentName);
    }

    public void displayInfo() {
        System.out.println("Calculating grades for " + studentName + "...");
    }

    // Overloading: same name, different parameters
    public double calculateGrade(double score) {
        return score;
    }

    public double calculateGrade(double score, double extraCredit) {
        return score + extraCredit;
    }
}

public class PolymorphismDemo extends GradeCalculator {
    public PolymorphismDemo(String studentName) {
        // super() sends data to the parent constructor
        super(studentName);
        System.out.println("PolymorphismDemo constructor called");
    }

    // Overriding: same signature, different implementation (child class)
    @Override
    public void displayInfo() {
        System.out.println("Polymorphism Demo: Grade Report for " + studentName);
    }

    public static void main(String[] args) {
        PolymorphismDemo demo = new PolymorphismDemo("Alice");

        // Demonstrate Overriding
        demo.displayInfo();

        // Demonstrate Overloading
        System.out.println("Normal Grade: " + demo.calculateGrade(85.0));
        System.out.println("With Extra Credit: " + demo.calculateGrade(85.0, 5.0));
    }
}
