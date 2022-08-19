package RecordVsClass;

import EnumVsStaticFinal.UseEnum;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int SIZE = 10_000_000;
    public static void main(String[] args) throws IOException, InterruptedException {

        double version = Double.parseDouble(System.getProperty("java.specification.version"));
        System.out.println("Java version: " + version);
        System.out.println("press Enter to START when profiler is READY");
        System.in.read();
        for (int k = 0; k < 5; k++) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 5; i++) {
                ClassClass.start();
            }
            long end = System.currentTimeMillis();
            System.out.println("ClassClass -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);


            start = System.currentTimeMillis();
            for (int i = 0; i < 5; i++) {
                RecordClass.start();
            }
            end = System.currentTimeMillis();
            System.out.println("RecordClass -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);
        }
    }

}
