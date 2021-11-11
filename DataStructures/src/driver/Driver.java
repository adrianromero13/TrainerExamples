package driver;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
//		Queue<Employee> q = new PriorityQueue<Employee>();
//		q.add(new Employee()); // adds item to the 'back of the line'
//		q.remove(); // removes 'takes' the next queued-up item, ie "next in line"
//		q.peek(); // Look at the next item in line without removing it
//		q.poll(); // returns the head of the queue
//		
		// Sets throw out new elements if they are not unique to the Set
		// Iterable, but doesn't have an index
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(1);
		System.out.println(s.toString());
		
		Map<String, Integer> ages = new HashMap<String, Integer>();
		// jacob = 100 is the key:value pair
		ages.put("Jacob", 100);
		int age = ages.get("Jacob");
		
		System.out.println(age);
		
		// Final note: many data structure algorithms have an official implementation in the Collections API,
		// and are specifically implemented as static methods in the Collections
		// (so you can just call Collections.whatever() )
	}
}
