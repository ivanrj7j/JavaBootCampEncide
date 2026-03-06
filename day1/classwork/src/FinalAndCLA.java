public class FinalAndCLA {
    // final: constant value that cannot be reassigned
    private static final double PASS_MARK = 50.0;

    // static method: belongs to class, no object required
    public static double calculatePercentage(double score, double total) {
        if (total == 0) {
            return 0;
        }
        return (score / total) * 100;
    }

    public static void main(String[] args) {
        // Command-line arguments demo
        if (args.length < 2) {
            System.out.println("Usage: java SyllabusEssentials <score> <total>");
            System.out.println("Example: java SyllabusEssentials 42 60");
            return;
        }

        double score = Double.parseDouble(args[0]);
        double total = Double.parseDouble(args[1]);

        double percentage = calculatePercentage(score, total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= PASS_MARK) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        // PASS_MARK = 60; // compiler error: cannot assign value to final variable
    }
}
