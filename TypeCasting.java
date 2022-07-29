//Type Casting :-converting the value of a variable from one data type to another
//2 types of Typecasting:- 1)Widening 2)Narrowing
//Widening : Converting a lower data type into a higher one. It is done automatically. Safe because no chance to lose data.
//byte -> short -> char -> int -> long -> float -> double  
//Narrowing : Converting a higher data type into a lower one.
//It is done manually by the programmer. If we do not perform casting then the compiler reports a compile-time error.
//double -> float -> long -> int -> char -> short -> byte  

class TypeCasting
{
	public static void main(String args[])
	{
		int x = 7;
		long y = x;
		double d = y;
		System.out.println("Widening typecasting x="+x+" y="+y+" d="+d);
		
		char ch = 'A';
		int in= (char)ch;
		System.out.println("ch="+ch+" in="+in);
		
		float f=65.3f;
		int i = (int)f;
		char c = (char)i;
		short s = (short)c;
		System.out.println("Narrowing typecasting f="+f+" i="+i+" c="+c+" s="+s);
	}
}
		
