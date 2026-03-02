public class StringDebate {
    public static void main(String[] args) {
        // == checks memory reference, .equals() checks content
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println("str1 == str2: " + (str1 == str2)); // Fails (false)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Succeeds (true)

        // Live Demo: String Concatenation vs StringBuffer
        // String is immutable (creates new objects in every loop iteration)
        String s = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String loop time: " + (endTime - startTime) + "ms");

        // StringBuffer is mutable (modifies the same object)
        StringBuffer sb = new StringBuffer("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer loop time: " + (endTime - startTime) + "ms");
    }
}
