package StreamTesting;

import java.util.List;

public class StreamReduceReference {


    public static void start(List<Employee> employees){

        long integer = employees.stream()
                .map(employee -> (int) employee.age)
                .reduce(0, Integer::sum);

    }
}
