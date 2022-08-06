//ArrayList is a part of collection framework
//ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.
//ArrayList is not Synchronized. Its equivalent synchronized class in Java is Vector.

import java.util.*;
class arraylist
{
	public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<5 ; i++)
		{
			arr.add(i);
		}
		System.out.println(arr);
		
		arr.remove(1);
		System.out.println(arr);
		for (int i = 0; i < arr.size(); i++) 
            System.out.print(arr.get(i) + " ");
		
		System.out.println("\n");
		ArrayList<Integer> arr2 = new ArrayList<>(arr);
		arr2.add(9);
		System.out.println(arr2);
		
		arr2.set(arr2.size()-1, 100);
		System.out.println(arr2);
		
		
		
		
		
		
	}
}