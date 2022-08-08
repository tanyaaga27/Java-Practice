//Treemap automaticaly keeps all the entries in a sorted manner
//TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
//TreeMap contains only unique elements.
//TreeMap cannot have a null key but can have multiple null values.
//TreeMap is non synchronized.
//TreeMap maintains ascending order.
// It implements the NavigableMap interface and extends AbstractMap class.

import java.util.*;
class treeMap
{
	public static void main(String args[])
	{
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100, "Tanya");
		map.put(50, "Jenny");
		map.put(20, "Christina");
		map.put(4, "Jane");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m);
		}
		map.remove(50);
		System.out.println("After removing an entry");
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m);
		}
		//Maintains descending order  
        System.out.println("descendingMap: "+map.descendingMap());
		
		//Returns key-value pairs whose keys are less than or equal to the specified key.  
        System.out.println("headMap: "+map.headMap(20,true));
		
		//Returns key-value pairs whose keys are greater than or equal to the specified key.  
        System.out.println("tailMap: "+map.tailMap(20,true));
		
		//Returns key-value pairs exists in between the specified key.  
        System.out.println("subMap: "+map.subMap(4, false, 100, true)); 
		
	}
}