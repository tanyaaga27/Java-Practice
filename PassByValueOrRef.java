class Test
{
	int sum;
	public void setValue(int a)
	{
		sum=a;
	}
	public int getValue()
	{
		return sum;
	}
}
class PassByValueOrRef
{
	public static void main(String args[])
	{
		Test mytest = new Test();
		mytest.setValue(10);
		increaseSum(mytest);
		
		System.out.println(mytest.getValue());
		
	} 
	public static void increaseSum(Test test)
	{
		//test.setValue(test.getValue()+1);
		test = new Test();
		test.setValue(100);
		
	}
}
	
//Java is always pass by value. 
//Object variable holds the address of the actual object so when passing an object as a method parameter, the address gets copied to the new variable.
