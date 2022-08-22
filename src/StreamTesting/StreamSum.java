package StreamTesting;

import java.util.List;

public class StreamSum {

    public static void start(List<Employee> employees){

        long integer = employees.stream()
                .mapToInt(employee -> (int) employee.age).sum();

    }
}
