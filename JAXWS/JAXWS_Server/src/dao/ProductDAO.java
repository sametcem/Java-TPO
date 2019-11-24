package dao;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductDAO {
	
	public Product find() {
		return new Product("p01","name1",100);
	}
	
	public List<Product> findAll() {
		List<Product> result = new ArrayList<Product>();
		result.add(new Product("p01","name1",100));
		result.add(new Product("p02","name2",200));
		result.add(new Product("p03","name3",300));
		result.add(new Product("p04","name4",400));
		return result;
	}
}
