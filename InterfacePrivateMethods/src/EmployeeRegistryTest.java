import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeRegistryTest {
    private EmployeeRegistry employeeRegistry;

    @BeforeEach
    public void setUp() {
        employeeRegistry = new EmployeeRegistry();
    }

    @Test
    public void testAddEmployee() {
        Employee employee1 = new Employee("John", "Organization A");
        Employee employee2 = new Employee("Jane", "Organization B");

        employeeRegistry.addEmployee("Organization A", employee1);
        employeeRegistry.addEmployee("Organization B", employee2);

        List<Employee> employeesA = employeeRegistry.getEmployeesByOrganization("Organization A");
        List<Employee> employeesB = employeeRegistry.getEmployeesByOrganization("Organization B");

        Assertions.assertEquals(1, employeesA.size());
        Assertions.assertEquals(1, employeesB.size());
        Assertions.assertEquals("John", employeesA.get(0).getName());
        Assertions.assertEquals("Jane", employeesB.get(0).getName());
    }



    @Test
    public void testGetEmployeesByOrganization() {
        Employee employee1 = new Employee("John", "Organization A");
        Employee employee2 = new Employee("Jane", "Organization A");
        Employee employee3 = new Employee("Alice", "Organization B");

        employeeRegistry.addEmployee("Organization A", employee1);
        employeeRegistry.addEmployee("Organization A", employee2);
        employeeRegistry.addEmployee("Organization B", employee3);

        List<Employee> employeesA = employeeRegistry.getEmployeesByOrganization("Organization A");
        List<Employee> employeesB = employeeRegistry.getEmployeesByOrganization("Organization B");

        Assertions.assertEquals(2, employeesA.size());
        Assertions.assertEquals(1, employeesB.size());
        Assertions.assertEquals("John", employeesA.get(0).getName());
        Assertions.assertEquals("Jane", employeesA.get(1).getName());
        Assertions.assertEquals("Alice", employeesB.get(0).getName());
    }
}