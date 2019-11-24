package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import entities.Product;

@WebService
public interface ProductWs {
	
	@WebMethod
	public Product find();
	
	@WebMethod
	public List<Product> findAll();
}
