package inheritance;

public class Student extends Person{
	int id;
	
	// no argument constructor - Why?
	Student(){
		
	}
	
	//argument constructor
	Student(String name,int id){
//		this.name=name;
		super(name);
		this.id=id;
	}

}
