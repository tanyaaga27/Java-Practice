//Run-Rime Polymorphism 
//Also called as C.T./Dynamic Polymorphism
//To achieve method Overriding:-
//same name
//diff. class
//same argument
//From Java 5 onwards, we can have covariant return type
//If the return type of child class method is child class of return type of parent class method, then this is also called method overriding
//class Test
//{
//	Object show()              return type is Object 
//	{
//	}
//}
//class xyz extends Test
//{
//	String show()              return type is String which is child class of Object class
//	{
//	}
//}

//Access modifier of Overriden method of child class should bigger than that of parent class method
class Test
{
	protected void show()
	{
		 System.out.println("1");
	}
}
class MethodOverriding extends Test
{
	public void show()
	{
		System.out.println("2");
	}
	public static void main(String args[])
	{
		MethodOverriding obj= new MethodOverriding();
		obj.show();
		Test test = new Test();
		test.show();
	}
}