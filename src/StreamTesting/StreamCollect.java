package StreamTesting;

import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class StreamCollect {


    public static void start(List<Employee> employees){

        long integer = employees.stream()
                .map(employee -> (int) employee.age)
                .collect(Collectors.summingInt(Integer::intValue));


    }
}
