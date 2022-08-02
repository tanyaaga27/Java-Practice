class TypesOfLoops
{
	public static void main(String args[])
	{
		int num=1;
		int flag=0;
		while(num<10)
		{
			System.out.println("In the while loop");
			if(flag==0)
			{
				num++;
			}
			else
				num+=2;
		}
		
		int count=0;
		
		do{
			System.out.println("Inside do while loop");
			count++;
		}while(count<3);
		
		
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Inside for loop");
		}
		
		int arr[] = {3,35,73,-1,56,11};
		for(int i : arr)
		{
			System.out.println("Inside for-each loop");
			System.out.println(i);
		}
	}
}
		
			