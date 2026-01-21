package codingSimple;

public class PrimeNumberCheckNegative {
	public static void main(String[] args) {
		int num = 9;
		if(num<=1) 
			{
			System.out.println("Not Prime");
			return;
			}
		
		
		int count=1;
		
		boolean isPrime = true;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) System.out.println("Prime");
		else System.out.println("Not a prime");
		
		
		
		
	}

}
