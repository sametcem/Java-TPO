package employee.services;

import javax.xml.ws.Endpoint;

public class Exporter {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7700/samet/s17181/employeeservice", new EmployeeServiceImpl());
	}

}
