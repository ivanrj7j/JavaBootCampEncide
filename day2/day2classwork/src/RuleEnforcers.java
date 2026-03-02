abstract class BaseTemplate {
    // Abstract method (no implementation)
    abstract void showMessage();
}

public class RuleEnforcers extends BaseTemplate {
    // Static belongs to the class
    static int counter = 0;

    // Final prevents modification
    final double PI = 3.14159;

    @Override
    void showMessage() {
        System.out.println("Abstract method implemented");
    }

    public static void main(String[] args) {
        RuleEnforcers.counter++;
        System.out.println("Counter: " + RuleEnforcers.counter);

        RuleEnforcers demo = new RuleEnforcers();
        demo.showMessage();

        // demo.PI = 3.0; // This would cause a compiler error
        // BaseTemplate bt = new BaseTemplate(); // This would also cause an error
    }
}
