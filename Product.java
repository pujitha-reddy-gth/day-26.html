package com.product;

import com.manufacturer.Manufacture;

public class Product {

	
	
	   private String productName;
	   private String category;
	   private Manufacture manufacturer;
	   private double price;
	   
	   private  Product( String productName, String category,Manufacture manufacturer,double price) 
	   {
		   this.manufacturer=manufacturer;
		   this.category=category;
		   this.price=price;
		   this.productName=productName;
	   }
	   public void setProductame(String productName)
	   {
		   this.productName=productName;
	   }
	   public void setCategory(String category)
	   {
		   this.category=category;
	   }
	   public void setPrice(double price)
	   {
		   this.price=price;
	   }
	   public void setManufacturer(Manufacture manufacturer)
	   {
		   this.manufacturer=manufacturer;
	   }
	   public String getProductName()
	   {
		   return productName;
	   }
	   public Manufacture getManufacturer()
	   {
		   return manufacturer;
	   }
	   public String getCategory()
	   {
		   return category;
	   }
	   public double getPrice()
	   {
		   return price;
	   }
	   public String toString()
	   {
		   return productName+price+category+manufacturer;
	   }
	   
	   public static Product getProductObject(String productName, String category,Manufacture manufacturer,double price) 
	   {
		   if ((manufacturer==null)||(price<=0))
		 {
			   return null;
		 }
		   return new Product(productName,category,manufacturer,price);    
	   }
	   
	


	}


