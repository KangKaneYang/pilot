@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository EmployeeRepository;
    @Transactional
    @Override
    public Employee saveEmployee(Employee Employee) {
        return EmployeeRepository.save(Employee);
    }
    @Transactional
    @Override
    public Employee getEmployee(Long id) {
        return EmployeeRepository.findById(id).orElse(null);
    }
    @Override
    public Employee getEmployeeByName(String name) {
        return EmployeeRepository.findByName(name);
    }
    
    @Transactional
    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee t = EmployeeRepository.findById(id).orElse(null);
        if (t == null) {
            throw new NotFoundException("Not exist");
        }
        BeanUtils.copyProperties(Employee,t);
        return EmployeeRepository.save(t);
    }
    @Transactional
    @Override
    public void deleteEmployee(Long id) {
        EmployeeRepository.deleteById(id);
    }
}
