package StreamTesting;

import java.util.List;

public class StreamReduceReference {


    public static void start(List<Employee> employees){

        long integer = employees.stream()
                .filter(employee -> employee.getAge() < 5890 &&
                        employee.getIdNumber() % 3 == 0 ||
                        employee.getIdNumber() % 5 == 0)
                .map(employee -> (int) employee.age)
                .reduce(0, Integer::sum);

    }
}
