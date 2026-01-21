package dequePrograms;

import java.util.ArrayDeque;

public class ArrayDequeEx {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque(7);
		ad.add(10);
		ad.add(16);
		ad.add(1);
		ad.add("Hello");
		ad.add(10);
		ad.add(32);
		// ad.add(null); // not work
		ad.add("Hello");

		System.out.println(ad);

		ad.offer(5); // add at the end
		ad.offerFirst("Hii"); // add at the start

		ad.offerLast("Byee"); // add at the end

		System.out.println(ad);

		ad.poll(); // remove from the start
		System.out.println(ad);

		ad.pollFirst(); // remove from the start
		System.out.println(ad);

		ad.pollLast(); // remove from the end
		System.out.println(ad);
	}

}
