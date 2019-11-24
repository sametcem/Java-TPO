package main;

import ws.*;

public class Main {
	public static void main(String[] args) {
		
		try {
			DemoImplService demoImplService = new DemoImplServiceLocator();
			Demo demo = demoImplService.getDemoImplPort();
			System.out.println(demo.helloWorld());
			System.out.println(demo.hi("Samet"));
			
			ProductWsImplService productWsImplService = new ProductWsImplServiceLocator();
			ProductWs productWs = productWsImplService.getProductWsImplPort();
			Product product = productWs.find();
			
			System.out.println("Id: " + product.getId() + "\nName: " 
			+ product.getName() + "\nPrice" + product.getPrice());
			
			System.out.println("========================");
			
			Product [] listProduct = productWs.findAll();
			for(Product p : listProduct) {
				System.out.println("Id: " + p.getId() + "\nName: " 
						+ p.getName() + "\nPrice" + p.getPrice());
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
