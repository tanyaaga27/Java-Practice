import java.util.*;
class linkedlist
{
	public static void main(String args[])
	{
		LinkedList<Integer> ll= new LinkedList<>();
		
		//Adding Elements 
		ll.add(5);
		ll.add(25);
		ll.add(21);
		ll.add(87);
		ll.add(34);
		ll.add(77);
		System.out.println(ll);
		
		
		//Adding element at a particular index
		ll.add(0,100);
		System.out.println(ll);
		//Changing element
		ll.set(2,90);
		System.out.println(ll);
		//Removing
		ll.remove(1);
		System.out.println(ll);
		//Iterating
		System.out.println("Iterating using for loop");
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+" ");
		}
		System.out.println("\n Iterating using for each loop");
		for(int i : ll)
		{
			System.out.print(i+" ");
		}
	}
}
		
		