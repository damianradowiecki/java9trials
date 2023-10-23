import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRegistry {
    private Map<String, List<Employee>> organizationMap;

    public EmployeeRegistry() {
        organizationMap = Collections.synchronizedMap(new HashMap<>());
    }

    public synchronized void addEmployee(String organizationName, Employee employee) {
        List<Employee> employees = organizationMap.getOrDefault(organizationName, new ArrayList<>());
        employees.add(employee);
        organizationMap.put(organizationName, employees);
    }

    public synchronized List<Employee> getEmployeesByOrganization(String organizationName) {
        return organizationMap.getOrDefault(organizationName, new ArrayList<>());
    }
}
