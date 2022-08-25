package StreamTesting;

import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class StreamCollect {


    public static void start(List<Employee> employees){

        double integer = employees.stream()
                .map(employee -> employee.age)
                .collect(Collectors.summingDouble(Double::doubleValue));


    }
}
