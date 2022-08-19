package CopyAnArray;


import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        try {
            double version = Double.parseDouble(System.getProperty("java.specification.version"));
            System.out.println("Java version: " + version);
            System.out.println("press Enter to START when profiler is READY");
            System.in.read();

            long start = System.currentTimeMillis();
            CopyByForLoop.start();
            long end = System.currentTimeMillis();
            System.out.println("CopyByForLoop -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);

            start = System.currentTimeMillis();
            CopyByClone.start();
            end = System.currentTimeMillis();
            System.out.println("CopyByClone -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);


            start = System.currentTimeMillis();
            CopyWithCopyOf.start();
            end = System.currentTimeMillis();
            System.out.println("CopyWithCopyOf -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);


            start = System.currentTimeMillis();
            CopyWithArrayCopy.start();
            end = System.currentTimeMillis();
            System.out.println("CopyWithArrayCopy -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);

            start = System.currentTimeMillis();
            CopyWithForEach.start();
            end = System.currentTimeMillis();
            System.out.println("CopyWithForEach -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);

            System.out.println("END");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
