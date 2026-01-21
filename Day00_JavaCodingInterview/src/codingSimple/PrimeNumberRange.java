package codingSimple;

public class PrimeNumberRange {
	static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int start=1;
		int end=49;
		for(int n = start;n<=end;n++) {
			if(isPrime(n)) {
				System.out.print(n+" ");
			}
		}
	}

}
