package ws;

import java.util.List;

import javax.jws.WebService;

import dao.ProductDAO;
import entities.Product;

@WebService(endpointInterface="ws.ProductWs")
public class ProductWsImpl implements ProductWs {
	
	private ProductDAO productDAO = new ProductDAO();
	
	@Override
	public Product find() {
		return this.productDAO.find();
	}

	@Override
	public List<Product> findAll() {
		return this.productDAO.findAll();
	}

}
