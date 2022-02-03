@RestController
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;
  
    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable Long id) {
        return employeeService.getEmployee(Long id);
    }
    @PostMapping("/employee")
    public void save(@RequestBody Employee e) {
        employeeService.save(e); 
    }
    @PutMapping("/employee/{id}")
    public void put(@PathVariable Long id, @RequestBody Employee e) {
        employeeService.updateEmployee(id, e); 
    }
    @DeleteMapping("/employee/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
