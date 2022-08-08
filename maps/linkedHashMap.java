//LinkedHashMap extends HashMap class and implements Map interface.
//It is just like a HashMap but maintains the insertion order
//It uses a doubly linked list to store the insertion order


import java.util.*;
class linkedHashMap
{
	public static void main(String args[])
	{
		LinkedHashMap<String,String> map = new LinkedHashMap<>();
		map.put("one", "Apples");
		map.put("two", "Oranges");
		map.put("three", "Kiwi");
		map.put("four", "Guava");
		map.put("five", "Mango");
		map.put("six", "Cherry");
		
		System.out.println(map);
		
		System.out.println("Getting value for key 'two': "+map.get("two"));
		System.out.println("Size :" +map.size());
		System.out.println("Contains key seven :" + map.containsKey("seven"));
		System.out.println("Contains value Mango:"+map.containsValue("Mango"));
		 System.out.println("delete element 'one': "+ map.remove("one"));
		 
		 System.out.println("After making changes:" + map);
		
	}
}