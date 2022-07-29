class Test
{
	private int id;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
}
class Encaps
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.setId(100);
		System.out.print(t.getId());
		
	}
}

//Encapsulation is wrapping up data and methods together in one unit is called Encapsulation
//Encapsulation means that a class publishes only what is needed for others to use it, and no more.