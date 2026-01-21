package oops;

public class Encapsulation {
	private int price;
	
	//setter
	public void setPrice(int price) {
		
		//Validation
		if(price>0) {
			this.price=price;
		}
	}
	
	//getter - I want the data
	public int getPrice() {
		return price;
	}
	
}
