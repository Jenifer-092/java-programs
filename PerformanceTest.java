package Strings;

public class PerformanceTest {
    public static void main(String[] args) {

        long start, end;

        // StringBuffer
        StringBuffer sbf = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sbf.append("AIET");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");

        // StringBuilder
        StringBuilder sbd = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sbd.append("AIET");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");
    }
}