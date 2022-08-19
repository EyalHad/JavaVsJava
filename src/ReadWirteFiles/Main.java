package ReadWirteFiles;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int SIZE = 10_000;

    public static void main(String[] args) throws IOException, InterruptedException {

        double version = Double.parseDouble(System.getProperty("java.specification.version"));
        System.out.println("Java version: " + version);
        System.out.println("press Enter to START when profiler is READY");
        System.in.read();
        for (int k = 0; k < 5; k++) {

            long start = System.currentTimeMillis();
            for (int i = 0; i < 5; i++) {
                BufferedWriterMethod.start();
                clean();
            }
            long end = System.currentTimeMillis();
            System.out.println("BufferedWriterMethod -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);


            start = System.currentTimeMillis();
            for (int i = 0; i < 5; i++) {
                PrintWriterMethod.start();
                clean();
            }
            end = System.currentTimeMillis();
            System.out.println("PrintWriterMethod -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);
        }



    }

    public static void clean(){

        for (int i = 0; i < SIZE; i++) {
            File myObj = new File("file"+i);
            if (myObj.delete()) {
            } else {
                System.out.println("Failed to delete the file.");
            }
        }

    }
}
