package com.Main2;


import com.manufacturer.Manufacture;
import com.product.Product;

public class Main {

	
	public static void main(String[] args) {
	System.out.println("Manufacture:");
	Manufacture manufacturer=Manufacture.getManufacturerObject("BMW X5", "CANADA", "235665262");
	Product product=Product.getProductObject("Bus", "Yatra", manufacturer,58963);
	if(manufacturer==null || product==null) {
	System.out.println("Invalid product/manufacturer information.");
	}
	else {
	System.out.println("---Product Details---");
	System.out.println(product);
	}
	System.out.println("---ManufactureDratils---");
	System.out.println(manufacturer);
	}
	
	}


