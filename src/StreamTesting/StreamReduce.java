package StreamTesting;

import java.util.List;
@SuppressWarnings("ALL")

public class StreamReduce {

    public static void start(List<Employee> employees){

        long integer = employees.stream()
                .map(employee -> (int) employee.age)
                .reduce(0, (a, b) -> a + b);

    }
}
