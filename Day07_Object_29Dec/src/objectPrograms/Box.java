package objectPrograms;

// Here 3 non-static --> length,breadth,getArea()
public class Box {
	double length;
	double breadth;
	
	//Parameterized Constructor
	Box(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	// Static Method
//	public static double getArea() {		It gives error because to access static method to non-static members
//		return length*breadth;
//	}
	
	// non-static method
	public double getArea() {
		return length*breadth;
	}

}
