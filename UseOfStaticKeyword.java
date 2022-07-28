//Static keyword can be used with variables, methods, and inner classes
//A class variable can be declared static. Static class variable belongs to the class nad not to the object. It is shared between all the objects.
//Helps in memory management. Makes it more memory efficient. 

class test
{
	int a;
	static int b=0;
	test()
	{
		a++;
		b++;
		System.out.println("a="+a+"b="+b);
	}
	
	
}
class UseOfStaticKeyword
{
	public static void main(String args[])
	{
		test test1=new test();
		test test2=new test();
		test test3=new test();

	}
}