package queuePrograms;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue pq= new PriorityQueue();
		pq.add(10);
		pq.add(1);
		pq.add(5);
		pq.add(16);
//		pq.add(null); // not work
//		pq.add("Hello"); // not work
		
		pq.offer(10);
		pq.offer(1);
		pq.offer(5);
		pq.offer(16);
		
		System.out.println(pq);
		
	}

}

// characteristics of priority queue
// 
