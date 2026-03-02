public class ControlFlowRefresh {
    public static void main(String[] args) {
        // Demonstration of if-else
        int number = 10;
        if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non-positive");
        }

        // Demonstration of for loop
        System.out.println("For loop counting:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // Demonstration of while loop
        System.out.println("While loop counting down:");
        int count = 3;
        while (count > 0) {
            System.out.println("T-minus " + count);
            count--;
        }

        // Demonstration of switch
        int day = 2;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other day"); break;
        }
    }
}
