package SwitchVsIfElse;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static int SIZE = 9_000_000;
    public static int val = 0;
    public static void main(String[] args) throws IOException, InterruptedException {

        String[] strings = new String[SIZE];
        for (int i = 0; i < SIZE; i++) { strings[i] = i + " " + -i; }

        double version = Double.parseDouble(System.getProperty("java.specification.version"));
        System.out.println("Java version: " + version);
        System.out.println("press Enter to START when profiler is READY");
        System.in.read();

        for (int k = 0;k < 3; k++) {


            long start = System.currentTimeMillis();
            for (int i = 0; i < 8; i++) {IfElseCases.start(strings);}
            long end = System.currentTimeMillis();
            System.out.println("IfElseCases -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(3);

            start = System.currentTimeMillis();
            for (int i = 0; i < 8; i++) {SwitchCases.start(strings);}
            end = System.currentTimeMillis();
            System.out.println("SwitchCases -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(3);


            start = System.currentTimeMillis();
            for (int i = 0; i < 8; i++) {SwitchEnhanced.start(strings);}
            end = System.currentTimeMillis();
            System.out.println("SwitchEnhanced -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(3);

        }
    }
}
