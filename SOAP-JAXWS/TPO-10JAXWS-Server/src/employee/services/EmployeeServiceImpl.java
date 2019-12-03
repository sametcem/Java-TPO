package employee.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import employee.domain.Employee;

@WebService
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> emps = new ArrayList<>();

	public void loadEmp() {
		emps.add(new Employee("Samet", "Habiboglu", new Date(1997, 1, 26)));
		emps.add(new Employee("Mick", "Jagger", new Date(1954, 3, 10)));
		emps.add(new Employee("Ken", "Basewood", new Date(1977, 9, 21)));
	}

	@Override
	public List<Employee> getEmployeeByFirstName(String firstName) {

		loadEmp();
		List<Employee> myList = new ArrayList<>();

		for (Employee e : emps) {
			if (e.getFirstName().equals(firstName)) {
				myList.add(e);
			}
		}

		return myList;
	}

	@Override
	public List<Employee> getEmployeeByLastName(String lastName) {

		loadEmp();
		List<Employee> myList = new ArrayList<>();

		for (Employee e : emps) {
			if (e.getLastName().equals(lastName)) {
				myList.add(e);
			}
		}

		return myList;
	}

	@Override
	public List<Employee> getEmployeeByBirthDate(Date birthDate) {

		loadEmp();
		List<Employee> myList = new ArrayList<>();

		for (Employee e : emps) {
			if (e.getBirtDate().equals(birthDate)) {
				myList.add(e);
			}
		}

		return myList;
	}

}
