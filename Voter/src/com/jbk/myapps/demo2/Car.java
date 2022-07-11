package com.jbk.myapps.demo2;

public class Car {

	String companyname;
	String model;
	String fueltype;
	String mileage;
	String launchyear;
	
	void getData(String companyname, String model,
			      String fueltype, String mileage, String launchyear)
	
	{
		this.companyname=companyname;
		this.model=model;
		this.fueltype=fueltype;
		this.mileage=mileage;
		this.launchyear=launchyear;
		}
  void display() {
	System.out.println("car's info");
			System.out.println("companyname:"+ companyname);
	System.out.println("model:"+ model );
	System.out.println("fueltype:"+fueltype);
	System.out.println("mileage:"+ mileage);
	System.out.println("launchyear:"+ launchyear);

}	

}