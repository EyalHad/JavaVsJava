package StreamTesting;

import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {


    public static void start(List<Employee> employees){
        long integer = employees.stream()
                .filter(employee -> employee.getAge() < 5890 &&
                        employee.getIdNumber() % 3 == 0 ||
                        employee.getIdNumber() % 5 == 0)
                .map(employee -> (int) employee.age)
                .collect(Collectors.summingInt(Integer::intValue));

        long integer2 = employees.stream()
                .filter(employee -> employee.getAge() > 5890 &&
                        employee.getIdNumber() % 3 == 0 ||
                        employee.getIdNumber() % 5 == 0)
                .map(employee -> (int) employee.age)
                .collect(Collectors.summingInt(Integer::intValue));

    }
}
