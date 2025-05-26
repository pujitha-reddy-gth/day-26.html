package com.manufacturer;

public class Manufacture {

	  private String manufacturer;
	    private String ManufacturerName;
	    private String registrationNumber;
	    
	    private Manufacture(String manufacturer, String ManufacturerName,String registrationNumber)
	    {
	    	this.manufacturer=manufacturer;
	    	this.ManufacturerName=ManufacturerName;
	    	this.registrationNumber=registrationNumber;
	    }
	    public void setManufacture(String manufacturer) 
	    {

	        this.manufacturer = manufacturer;
	    }

	    public String getManufacture() {
	        return manufacturer;
	    }

	    public void setManufacturerName(String manufacturerName) {
	        this.ManufacturerName = manufacturerName;
	    }

	    public String getManufacturerName() {
	        return ManufacturerName;
	    }

	    public void setRegistrationNumber(String registrationNumber) {
	        this.registrationNumber = registrationNumber;
	    }

	    public String getRegistrationNumber() {
	        return registrationNumber;
	    }

	    public String toString() 
	    {
	        return "Manufacturer [manufacturer=" + manufacturer + ", ManufacturerName=" + ManufacturerName + ", registrationNumber=" + registrationNumber + "]";
	    }
	    
	    public  static Manufacture getManufacturerObject(String manufacturer, String manufacturerName, String registrationNumber) {
	      if (registrationNumber.length()>=10)
	       {
	    	
	    	return null;   
	       }return new Manufacture(manufacturer, manufacturerName, registrationNumber);
	       
	    }
}
	
	


