package bootsample.dao;

import org.springframework.data.repository.CrudRepository;

import bootsample.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
}
