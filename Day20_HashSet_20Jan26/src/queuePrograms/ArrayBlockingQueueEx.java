package queuePrograms;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
	public static void main(String[] args) {
		ArrayBlockingQueue abq = new ArrayBlockingQueue(7);
		abq.add(10);
		abq.add(16);
		abq.add(1);
		abq.add("Hello");
		abq.add(10);
		abq.add(32);
//		abq.add(null); // not work
		abq.add("Hello");
		
//		abq.add(10); // Queue full if it is larger than declared and if smaller ,it work fine.
		
		System.out.println(abq);
		
	}

}
