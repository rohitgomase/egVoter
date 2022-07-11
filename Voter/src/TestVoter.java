
public class TestVoter {

public static void main(String[] args) {
	
	Voter v1 = new Voter();
	v1.getData(101, "Rohit", "2 apr 1994", "Wardha","Male");
	
	v1.display();
	
	
	System.out.println();
	
	Voter v2= new Voter();
	v2.getData(102, "ravi", "1 may 1995", "nagpur", "male");
	
	v2.display();
	
	Voter v3= new Voter();
	v3.getData(102, "shyam", "11 june 2000", "amravati", "male");
	
	v3.display();
	
	
}
}


