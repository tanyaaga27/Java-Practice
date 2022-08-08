//Queues maintain FIFO order
//Since Queue is an interface, objects cannot be created of the type queue. 
//We always need a class which extends this list in order to create an object.
//Can be implemented using linkedlist
//Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList in Java.
// PriorityBlockingQueue is one alternative implementation if the thread-safe implementation is needed
import java.util.*;
class queue
{
	public static void main(String args[])
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(100);
		q.add(35);
		q.add(90);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		// The elements are stored based on the priority order which is ascending by default.
		Queue<String> pq = new PriorityQueue<>();
  
        pq.add("Today");
        pq.add("Is");
		pq.add("A");
		pq.add("Beautiful");
        pq.add("Day");
  
        System.out.println(pq);
		pq.remove("Today");
		System.out.println("After remove: "+pq);
	}
}
		
		