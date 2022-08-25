package StreamTesting;

import java.util.List;

public class StreamSum {

    public static void start(List<Employee> employees){

        double integer = employees.stream()
                .mapToDouble(employee -> employee.age)
                .sum();

    }
}
