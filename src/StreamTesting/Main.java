package StreamTesting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static int SIZE = 10_000_000;

    public static void main(String[] args) throws IOException, InterruptedException {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            String firstname  = "first" + i;
            String lastname  = "last" + i;
            double age = i*11*13 / 3 + 1;
            long id = i*2*3*7 + 1;
            employees.add(new Employee(firstname,lastname,age,id));
        }
        double version = Double.parseDouble(System.getProperty("java.specification.version"));
        System.out.println("Java version: " + version);
        System.out.println("press Enter to START when profiler is READY");
        System.in.read();

        for (int k = 0;k < 2; k++) {


            long start = System.currentTimeMillis();
            for (int i = 0; i < 25; i++) {
                StreamReduceReference.start(employees);
            }
            long end = System.currentTimeMillis();
            System.out.println("StreamReduceReference -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(3);

            start = System.currentTimeMillis();
            for (int i = 0; i < 25; i++) {
                StreamReduce.start(employees);
            }
            end = System.currentTimeMillis();
            System.out.println("StreamReduce -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(3);


            start = System.currentTimeMillis();
            for (int i = 0; i < 25; i++) {
                StreamSum.start(employees);
            }
            end = System.currentTimeMillis();
            System.out.println("StreamSum -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(5);

            start = System.currentTimeMillis();
            for (int i = 0; i < 25; i++) {
                StreamCollect.start(employees);
            }
            end = System.currentTimeMillis();
            System.out.println("StreamCollect -> " + ((double) (end - start)) / 1000);
            TimeUnit.SECONDS.sleep(3);
        }






    }
}
