package com.jbk.myapps.demo2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Car c1 = new Car();
		
  c1.getData("TATA", "HARRIER", "PETROL", "15 KM", "2019");
	
	c1.display();
	System.out.println();
	
	Car c2= new Car();
	c2.getData("toyota", "innova", "diesel", "14", "2010");
	c2.display();
	System.out.println();
	
	Car c3=new Car();
	c3.getData("farrari", "Q40", "petrol", "10", "2009");
	c3.display();
	System.out.println();
	}

}
