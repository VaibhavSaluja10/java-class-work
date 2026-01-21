package objectClass;

public class Student {
	public static void main(String[] args) {
		ToEquals te = new ToEquals("Kavya",1);
		ToEquals te2 = new ToEquals("Kavya",1);
		
		System.out.println(te.equals(te2));
		System.out.println(te == te2);
		System.out.println(te.hashCode());
		System.out.println(te2.hashCode());
		System.out.println(te.hashCode() == te2.hashCode());
		
		System.out.println(te.getClass());
		
		
	}
	
	
	

}
