package hust.soict.hedspi.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with String concatenation: " + (endTime - startTime) + " ms");
    }
}