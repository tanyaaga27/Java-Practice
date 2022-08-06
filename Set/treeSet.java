//TreeSet class is implementation of SortedSet interface
//Duplicated not allowed.
//Objects in a TreeSet are stored in a sorted and ascending order.
//Insertion order not preserved. Some sorting order would be there. 
//Heterogeneous objects not allowed 
//Either Default natural sorting order or customized sorting using comparator
import java.util.*;
class treeSet
{
	public static void main(String args[])
	{
		TreeSet<Character> ts = new TreeSet<>();
		ts.add('A');
		ts.add('C');
		ts.add('B');
		ts.add('A');
        ts.add('D');
		ts.add('L');
		ts.add('Z');
		
 		
		
		System.out.println(ts);
		System.out.println(ts.contains('C'));
		
		// Find the values just greater
        // and smaller than the above string
        System.out.println("Higher " + ts.higher('C'));
        System.out.println("Lower " + ts.lower('C'));
		
		//Removal
		ts.remove('B');
		System.out.println("After removing element " + ts);
		// Now removing the first element
        // using pollFirst() method
        ts.pollFirst();
		ts.pollLast();
		System.out.println("After removing first and last element " + ts);
		
		for(char c : ts)
		{
			System.out.println(c);
		}
	}
}