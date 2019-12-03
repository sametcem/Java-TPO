package employee.services;

import java.util.Date;
import java.util.List;

import employee.domain.Employee;

public interface EmployeeService {
	public List<Employee> getEmployeeByFirstName(String firstName);

	public List<Employee> getEmployeeByLastName(String lastName);

	public List<Employee> getEmployeeByBirthDate(Date birthDate);

}
