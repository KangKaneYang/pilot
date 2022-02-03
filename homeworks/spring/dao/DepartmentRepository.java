public interface EmployeeRepository extends JpaRepository<Department,Long> {
    Department findByName(String name);
}
