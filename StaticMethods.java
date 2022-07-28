//Static method belongs to the class and not to the object 
//Called using class name 
//No need to create object so better memory management
//Cannot access non-static data i,e non-static class variables
//Static methods cannot make a call to non-static methods directly
// this and super keywords not allowed
class Test
{
	static void display()
	{
		System.out.println("Display method called");
	}
}
class StaticMethods
{
	public static void main(String args[])
	{
		Test.display();
	}
}