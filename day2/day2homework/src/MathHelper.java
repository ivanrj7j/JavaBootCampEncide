public class MathHelper {
    public static void main(String[] args) {
        MathHelper helper = new MathHelper();
        System.out.println("2 * 3 = " + helper.multiply(2, 3));
        System.out.println("2 * 3 * 4 = " + helper.multiply(2, 3, 4));
        System.out.println("2.5 * 3.5 = " + helper.multiply(2.5, 3.5));
    }

    // TODO: Write three overloaded methods named multiply:
    // 1. One taking two ints.
    // 2. One taking three ints.
    // 3. One taking two doubles.
}
