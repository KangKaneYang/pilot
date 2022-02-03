public interface DepartmentService {

    Department saveDepartment(Department type);

    Department getDepartment(Long id);

    Department getDepartmentByName(String name);

    Department updateDepartment(Long id, Department type);

    void deleteDepartment(Long id);

}
