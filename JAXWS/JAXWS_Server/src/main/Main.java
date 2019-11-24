package main;

import javax.jws.*;
import javax.xml.ws.*;
import ws.*;

public class Main {
	public static void main(String[] args) {
		try {
			Endpoint.publish("http://localhost:4790/ws/demo", new DemoImpl());
			Endpoint.publish("http://localhost:4790/ws/product", new ProductWsImpl());
			System.out.println("Done");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
