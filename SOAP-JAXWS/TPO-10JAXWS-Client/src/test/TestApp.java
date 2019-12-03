package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

import employee.services.Employee;
import employee.services.EmployeeServiceImpl;
import employee.services.EmployeeServiceImplService;

public class TestApp {
	//Call the web service
	//URL: http://localhost:7700/samet/s17181/employeeservice?wsdl
	
	static EmployeeServiceImpl webservice = new EmployeeServiceImplService().getEmployeeServiceImplPort();
	
	@Test
	public void employeeByFirstname() 
	{
		webservice.loadEmp();
		List<Employee> myList = webservice.getEmployeeByFirstName("Samet");
		assertEquals(myList.get(0).getLastName(), "Habiboglu");
	}
	
	@Test
	public void employeeBySurname() 
	{
		webservice.loadEmp();
		List<Employee> myList = webservice.getEmployeeByLastName("Habiboglu");
		assertEquals(myList.get(0).getFirstName(), "Samet");
	}
	
	@Test
	public void employeeByDate() throws DatatypeConfigurationException 
	{		
		GregorianCalendar firstDate = new GregorianCalendar();
		Date trialTime = new Date(1997,1,26);
		firstDate.setTime(trialTime);
		
		XMLGregorianCalendar testDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(firstDate);
		webservice.loadEmp();
		List<Employee> myList = webservice.getEmployeeByBirthDate(testDate);
		assertEquals(myList.get(0).getFirstName(), "Samet");
		assertEquals(myList.get(0).getLastName(),"Habiboglu");
	}

}
