import java.util.Arrays;
class ArrayList
{
	int size;
	int cap;
	Object arr[];
	ArrayList()
	{
		size = 0;
		cap = 5;
		arr = new Object[cap];
	}
	ArrayList(int c)
	{
		size = 0;
		cap = c;
		arr = new Object[cap];
	}
	Object get(int idx)
	{
		if(idx<size)
		{
			return arr[idx];
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	void add(Object o)
	{
		if(size>=cap*0.75)
			increaseSize();
		System.out.println("Adding "+o+"size="+size+"cap="+cap);
		arr[size] = o;
		size++;
	}
	void increaseSize()
	{
		arr = Arrays.copyOf(arr,arr.length*2);
		cap = arr.length;
		System.out.println("New Length="+arr.length);
	}
	Object remove(int idx)
	{
		if(idx<size)
		{
			Object obj = arr[idx];
			arr[idx] = null;
			int temp = idx;
			while(temp<size-1)
			{
				arr[temp] = arr[temp+1];
				arr[temp+1] = null;
				temp++;
			}
			size--;
			return obj;
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	int size()
	{
		return size;
	}
}
		
	
	
	
class creatingArrayList
{
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(5);
		list.add(12);
		list.add(20);
		list.add(80);
		list.add(100);
		list.add(10);
		list.add(32);
		list.add(34);
		list.add(112);
		list.add(99);
		list.add(90);
		System.out.println(list.remove(0));
		System.out.println("size="+list.size());
		System.out.println("Element at 0="+list.get(0));
	}
}
		