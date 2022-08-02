class IfElse 
{
	public static void main(String args[])
	{
		int a= 10;
		if(a<5)
			System.out.println("if statement");
		else if(a>5&&a<8)
			System.out.println("else-if statement");
		else
			System.out.println("else statement");
		
		int sum=55;
		if(sum>=100)
		{
			if(sum>115)
				System.out.println("gretater than 115");
			else
				System.out.println("gretater than 100, less than 115");
		}
		else
		{
			if(sum>50)
				System.out.println("gretater than 50, less than 100");
			else
				System.out.println("less than 50");
		}
	}
}