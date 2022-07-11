
public class Voter {

int id; 

String name;
String DOB;
String address;
String gender;

void getData (int id, String name, String DOB, 
		      String address, String gender ) { 
   
this.id=id;
this.name = name;
this.DOB = DOB;
this.address = address;
this.gender = gender;
}

void display() {
	System.out.println("Voter's details..");
	System.out.println("id:"+ id);
	System.out.println("name:" +name);
	System.out.println("DOB:"+DOB);
	System.out.println("address:"+address);
	System.out.println("gender:"+ gender);
}
}
