package hust.soict.hedspi.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();
        int iterations = 100000;

        // Test with String
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String concatenation time: " + (endTime - startTime) + " ms");

        // Test with StringBuilder
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder concatenation time: " + (endTime - startTime) + " ms");

        // Test with StringBuffer
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer concatenation time: " + (endTime - startTime) + " ms");
    }
}