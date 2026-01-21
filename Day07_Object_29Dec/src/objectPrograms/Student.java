package objectPrograms;

public class Student {
	String pan;
	String aadhar;
	String voting;
	
	// Constructor Overloading==>
	Student(){
		
	}
	Student(String pan){
		this();
		
		this.pan = pan;
	}
	
	Student(String pan,String aadhar){
		// should be first and cannot take two this statement in same class.
		this(pan); 
		// or
		// this.pan=pan;
		
		// this(pan,aadhar); // it should be one means paranthesis vala sirf one hona chaiye.jj
		
		this.aadhar=aadhar;
	}
	
	Student(String pan,String aadhar,String voting){
		this.pan=pan;
		this.aadhar=aadhar;
		this.voting=voting;
	}

}
