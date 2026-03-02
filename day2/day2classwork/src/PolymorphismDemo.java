class GradeCalculator {
    public void displayInfo() {
        System.out.println("Calculating grades...");
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
    // Overriding: same signature, different implementation (child class)
    @Override
    public void displayInfo() {
        System.out.println("Polymorphism Demo: Grade Report");
    }

    public static void main(String[] args) {
        PolymorphismDemo demo = new PolymorphismDemo();

        // Demonstrate Overriding
        demo.displayInfo();

        // Demonstrate Overloading
        System.out.println("Normal Grade: " + demo.calculateGrade(85.0));
        System.out.println("With Extra Credit: " + demo.calculateGrade(85.0, 5.0));
    }
}
