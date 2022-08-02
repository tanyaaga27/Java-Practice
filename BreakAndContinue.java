class BreakAndContinue
{
	public static void main(String args[])
	{
		int[] a = {24, -3, 5, 8,11,-11,-31,4,70,21};
		int sum=0;
		for(int i : a)
		{
			if(i<0)
				continue;
			if(sum+i>100)
				break;
			sum+=i;
			
		}
		System.out.println(sum);
	}
}
		