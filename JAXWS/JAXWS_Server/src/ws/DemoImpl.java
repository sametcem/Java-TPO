package ws;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.Demo")
public class DemoImpl implements Demo{

	@Override
	public String helloWorld() {
		return "Hello World";
	}

	@Override
	public String hi(String fullName) {
		return "Hello " + fullName;
	}

}
