//String is a non primitve data type. It's size is not fixed, It's a sequence/array of characters. String is a class which is declared final. 
//It extends object class. It implements CharSequence,serializable,comparable interface
//String is an object and it is immutable. 
//String Constant Pool :-
//It's a special memory location used to store string objects.
//Commonly used methods 
//1) length();   returns the length of the string
//2) isEmpty(); returns boolean value
//3) Trim() removes unnecessary spaces at the starting and end of the string
//4) Equals() , equalsIgnoreCase(),concat(), 
class TypesOfStrings
{
	/*public static void main(String args[])
	{
		String s = "Hello" ;
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		
		s = "  Hey!  ";
		System.out.println(s.trim());
	}*/
	/*public static void main(String args[]){  
        String s1="Sachin";  
        String s2="Sachin";  
        String s3="Ratana";  
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s3));//1(because s1>s3)  
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  */
		
		public static void main(String args[])
		{
			StringBuilder sb = new StringBuilder("Hello");
			sb.deleteCharAt(0);
			System.out.println(sb);
			sb.insert(0, "Hello H");
			System.out.println(sb);
			
			StringBuffer s = new StringBuffer("Learning Java");
			s.reverse();
			System.out.println(s);
		
			
 }  
}

//String Buffer is same as string but it is mutable. It is stored in the heap. It is thread safe. 
//StringBuilder is also mutable. It is stored in the heap. It is non-synchronized, two threads can have a shared resource. 
