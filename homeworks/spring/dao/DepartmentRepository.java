public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByName(String name);
}
