package employee.domain;

import java.util.Date;

public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;

	public Employee(String firstName, String lastName, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirtDate() {
		return birthDate;
	}

	public void setBirtDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + birthDate;
	}

}
