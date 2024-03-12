import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("John", 50000, "Developer"),
                new Empleado("Alice", 60000, "Analyst"),
                new Empleado("Bob", 70000, "Manager"),
                new Empleado("Sarah", 55000, "Developer"),
                new Empleado("Mike", 80000, "Manager")
        );

        double filterSalary = 60000;
        List<Empleado> highSalaryEmployees = empleados.stream()
                .filter(employee -> employee.getSalario() > filterSalary)
                .collect(Collectors.toList());
        System.out.println("Empleados con salario mayor a " + filterSalary + ": " + highSalaryEmployees);

        // Agrupar empleados por categoría y calcular salario promedio para cada categoría
        Map<String, Double> averageSalaryByCategory = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
        System.out.println("Sueldo promedio por categoría: " + averageSalaryByCategory);

        // Encontrar al empleado con el Sueldo más alto utilizando Optionals
        Optional<Empleado> highestSalaryEmployee = empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));
        highestSalaryEmployee.ifPresent(employee ->
                System.out.println("Empleado con el Sueldo más alto: " + empleados));
    }
}




