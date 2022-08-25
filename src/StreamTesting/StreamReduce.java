package StreamTesting;

import java.util.List;
@SuppressWarnings("ALL")

public class StreamReduce {

    public static void start(List<Employee> employees){

        double integer = employees.stream()
                .map(employee -> employee.age)
                .reduce(0.0, (a, b) -> a + b);

    }
}
