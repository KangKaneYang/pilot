@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository DepartmentRepository;
    @Transactional
    @Override
    public Department saveDepartment(Department department) {
        return DepartmentRepository.save(department);
    }
    @Transactional
    @Override
    public Department getDepartment(Long id) {
        return DepartmentRepository.findById(id).orElse(null);
    }
    @Override
    public Department getDepartmentByName(String name) {
        return DepartmentRepository.findByName(name);
    }
    
    @Transactional
    @Override
    public Department updateDepartment(Long id, Department department) {
        Department t = DepartmentRepository.findById(id).orElse(null);
        if (t == null) {
            throw new NotFoundException("Not exist");
        }
        BeanUtils.copyProperties(department,t);
        return DepartmentRepository.save(t);
    }
    @Transactional
    @Override
    public void deleteDepartment(Long id) {
        DepartmentRepository.deleteById(id);
    }
}
