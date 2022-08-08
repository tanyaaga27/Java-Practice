//HashMap class implements the Map interface 
//Stores key-value pair, where keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key.
//Java HashMap maintains no order.
//Java HashMap may have one null key and multiple null values.
//public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
import java.util.*;
class hashMap
{
	public static void main(String args[])
	{
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"Mango");  //Put elements in Map  
        map.put(2,"Apple");    
        map.put(3,"Banana");   
        map.put(4,"Grapes");
   
        System.out.println("Iterating Hashmap...");  
        for(Map.Entry m : map.entrySet())	
		{	
            System.out.println(m.getKey()+" "+m.getValue());    
        }  
		//No duplicate keys allowed
		map.put(3, "Kiwi");
		for(Map.Entry m : map.entrySet())	
		{	
            System.out.println(m.getKey()+" "+m.getValue());    
        }
		map.putIfAbsent(4, "Guava");  
		map.putIfAbsent(5, "Guava"); 
		map.remove(1);
		System.out.println("Updated list of elements: "+map); 
	}
}
		
		
		

		