public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByName(String name);
}
