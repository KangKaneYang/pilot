public interface EmployeeService {

    Employee saveEmployee(Employee type);

    Employee getEmployee(Long id);

    Employee getEmployeeByName(String name);

    Employee updateEmployee(Long id, Employee type);

    void deleteEmployee(Long id);

}
