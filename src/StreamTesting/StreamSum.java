package StreamTesting;

import java.util.List;

public class StreamSum {

    public static void start(List<Employee> employees){

        long integer = employees.stream()
                .filter(employee -> employee.getAge() < 5890 &&
                        employee.getIdNumber() % 3 == 0 ||
                        employee.getIdNumber() % 5 == 0)
                .mapToInt(employee -> (int) employee.age).sum();

    }
}
