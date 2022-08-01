//Wrapper class : a class whose object wraps or contains primitive data types
//When we create an object of wrapper class, it contains a field and in this field, we can store primitive data types.
//Uses :- 1)classes in java.util package handles only objects
//2) Data structures in the Collection framework, such as ArrayList and vector store only objects. 
import java.util.*;
class WrapperClasses
{
	public static void main(String args[])
	{
		int a=10;
		Integer b = a;                  //Autoboxing- primitive to Integer object conversion
		Integer i=Integer.valueOf(a);   //converting int into Integer explicitly 
		System.out.println("Autoboxing="+b+" converting explicity="+i);
		
		int i1 = b;                      //Automatic-unboxing
		int i2 =b.intValue();            //converting Integer to int explicitly  
		System.out.println(i1+" "+i2);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(25);             //// Autoboxing because ArrayList stores only objects
		 System.out.println(arrayList.get(0));
		 
		 Character c1 = 'a';
		 char c2 = c1;                  //// unboxing - Character object to primitive conversion
		 System.out.println(c2);
		 
	}
}
		 