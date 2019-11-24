package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Demo {
	
	@WebMethod
	public String helloWorld();
	
	@WebMethod
	public String hi(String fullName);

}
