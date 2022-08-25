package StreamTesting;

import java.util.List;
@SuppressWarnings("ALL")

public class StreamReduceReference {


    public static void start(List<Employee> employees){

        double integer = employees.stream()
                .map(employee -> employee.age)
                .reduce(0.0, Double::sum);

    }
}
