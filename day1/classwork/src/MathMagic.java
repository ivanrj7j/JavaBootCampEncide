public class MathMagic {
    // Encapsulation: hiding internal data
    private int secretValue = 42;

    // Abstraction: providing a simple interface for complex logic
    public int calculateComplexResult(int input) {
        return hiddenMath(input) + secretValue;
    }

    private int hiddenMath(int x) {
        // Complex logic hidden from the user
        return (x * x) / 2;
    }

    public static void main(String[] args) {
        MathMagic magic = new MathMagic();
        int result = magic.calculateComplexResult(10);
        System.out.println("Result: " + result);
    }
}
