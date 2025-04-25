package hust.soict.hedspi.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sbf.append("a");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ms");
    }
}