package bootsample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import bootsample.dao.EmployeeRepository;
import bootsample.model.Employee;
import bootsample.model.TinTuc;
@Service
@Transactional
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> findAll(){
		List<Employee> tintucs = new ArrayList<>();
		for(Employee tintuc : employeeRepository.findAll()){
			tintucs.add(tintuc);
		}
		return tintucs;
	}
	
	public int findEmployee(String tendangnhap,String pass){	
		for(Employee employee : employeeRepository.findAll()){
			if(employee.getName().equals(tendangnhap)&&employee.getPass().equals(pass))
			{			
				return 1;
			}				
		}
		return 0;
	}	
	
	
	public Optional<Employee> findEmployee(int id){
		Optional<Employee> emp = employeeRepository.findById(id);
		return emp;
	}
	
	public void save(Employee employee){
		employeeRepository.save(employee);
	}
	
	public void delete(int id){
		employeeRepository.deleteById(id);
	}
}
