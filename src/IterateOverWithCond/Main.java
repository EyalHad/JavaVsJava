package IterateOverWithCond;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {


        double version = Double.parseDouble(System.getProperty("java.specification.version"));
        System.out.println("Java version: " + version);
        System.out.println("press Enter to START when profiler is READY");
        System.in.read();

        for (int k = 0; k < 3; k++) {

            long start = System.currentTimeMillis();
            for (int i = 0; i < 2; i++) {ForEachLoop.start();}
            long end = System.currentTimeMillis();
            System.out.println("ForEachLoop -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);

            start = System.currentTimeMillis();
            for (int i = 0; i < 2; i++) {ForLoop.start();}
            end = System.currentTimeMillis();
            System.out.println("ForLoop -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);


            start = System.currentTimeMillis();
            for (int i = 0; i < 2; i++) {UsingStream.start();}
            end = System.currentTimeMillis();
            System.out.println("UsingStream -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);

        }
    }
}
