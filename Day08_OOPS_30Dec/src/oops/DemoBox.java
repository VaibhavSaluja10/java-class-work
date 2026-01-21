package oops;

public class DemoBox {
	double length;
	
	DemoBox(){
		
	}
	
	DemoBox(double length){
		this.length = length;
	}
	
	// helper method or factory method
	public static DemoBox createBox() {
		return new DemoBox();
	}
	
	public static DemoBox createBox(double length) {
		return new DemoBox(length);
	}

}
