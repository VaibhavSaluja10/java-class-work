//Write a Java program where:
//pin is private
//user can change PIN only after verification
//direct access to PIN is not allowed

package encapsulation;

public class AtmPin {
	private int pin;

	public int getPin() {
		return pin;
	}

	AtmPin(){
		
	}
	AtmPin(int pin){
		this.pin=pin;
	}
	
	

}
