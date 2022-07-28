//Static block executes automatically when the class is loaded in the memory (for <jdk1.6 versions)
//1.6 onwards, static block won't execute without main method
//Static block execute before main method automatically
//multiples static block can exist. Gets executed in the order they exist inside the class
//USES: 1) Use to initialize static members. 2) Code expected to load at the time of class loading should be inside static block 
class StaticBlock
{
	static
	{
		System.out.println("I am in first static block");
	}
	public static void main(String args[])
	{
		System.out.println("I am in main method");
	}
	static
	{
		System.out.println("I am in second static block");
	}
}