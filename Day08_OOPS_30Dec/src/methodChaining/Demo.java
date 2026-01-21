package methodChaining;

public class Demo {
	Demo m1(){
		return this;
	}
	
	Demo m2(){
		return this;
	}
	
	Demo m3(){
		return this;
	}
	
	Demo m4(){
		return this;
	}
	
	Demo m5(){
		return this;
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo obj = d1.m1();
		System.out.println(obj);
		
		Demo obj2 = d1.m1().m2();
		System.out.println(obj2);
		
		Demo obj3 = d1.m1().m2().m3().m4();
		System.out.println(obj3);
		
	}

}
