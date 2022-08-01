import java.util.*;
class FindCommonElements
{
	public static void main(String args[])
	{
		int[] Array1 = {1, 5, 10, 20, 40, 80};
		int[] Array2 = {6, 7, 20, 80, 100};
		int[] Array3 = {3, 4, 15, 20, 30, 70, 80, 120};
		int size;
		if(Array1.length<Array2.length)
			size = Array1.length;
		else
			size = Array2.length;
		int[] arr = new int[size];
		int idx=0;
		for(int i : Array2)
		{
			for(int j : Array1)
			{
				if(j==i)
				{
					arr[idx]=j;
					idx++;
				}
			}
		}
		if(idx==0)
			System.out.print("No common element found");
		
		for(int i=0;i<idx;i++)
		{
			for(int j=0;j<Array3.length;j++)
			{
				if(arr[i]==Array3[j])
				System.out.println(arr[i]);
			}
		}
		
		
		/* HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for(int i : Array1)
		{
			set1.add(i);
		}
		for(int i : Array2)
		{
			if(!set1.add(i))
				set2.add(i);
		}
		for(int i : Array3)
		{
			if(!set2.add(i))
				System.out.println(i);
		} */
	}
}