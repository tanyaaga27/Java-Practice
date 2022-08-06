import java.util.*;
class hashSet{
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<>();
		hs.add("Learning");
		hs.add("Java");
		hs.add("Collections");
		hs.add("Java"); //duplicates not allowed
		
		for(String s : hs)
		{
			System.out.println(s);
		} 
		hs.remove("Collections");
		System.out.println("After removing an element "+hs);
		
		 HashSet<String> set1=new HashSet<String>();  
         set1.add("Tanya");  
         set1.add("Agarwal");  
         hs.addAll(set1);  
         System.out.println("Updated List: "+hs);
		 
		 hs.removeAll(set1);
		 System.out.println("After invoking removeAll() method: "+hs);
		 
		 hs.clear();
		 
		 if(hs.isEmpty())
			 System.out.println("hs is empty");
		
		
	}
}
			
		