import java.util.*;
class RepeatedCharacters
{
	public static void main(String args[])
	{
		String s = "Hello world";
		
		//approach 1
		/*for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.print("Using approach 1="+s.charAt(i));
					return;
				}
			}
		}*/
		
		HashSet<Character> hs = new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				if(!hs.add(s.charAt(i)))
				{
					System.out.print("Using approach 2="+s.charAt(i));
					return;
				}
			}
		}
					
		
		
	}
}