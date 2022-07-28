class TypesOfConstructors
{
	int sum;
	String name;
	int diff;
	TypesOfConstructors()
	{
		sum=10;
		name="abc";
	}
	TypesOfConstructors(int sum,String name)
	{
		this.sum=sum;
		this.name=name;
	}
	
}
class test2
{
public static void main(String args[])
{
	TypesOfConstructors obj1=new TypesOfConstructors();
	System.out.println(obj1.sum);
	System.out.println(obj1.name);
	System.out.println(obj1.diff);
	TypesOfConstructors obj2=new TypesOfConstructors(100,"Tanya");
	System.out.println(obj2.sum);
	System.out.println(obj2.name);
	System.out.println(obj2.diff);
	
}
	
}


//Constructor is a block similar to method block having same name as that of class name.
//It does not have any return type
//Only modifiers allowed are public,protetcted,default and private
//It executes automatically when we create an object
//Test t=new Test() "Test()" is the part that calls the constructor
//new Test(); would call the constructor without saving the reference of object 
//Use :- Used to initialize an object
//There are 3 types of constructor:- 
//1)Default constrcutor : It is the constructor that is created/called by the compiler default when no other constructor is defined
//2)No arg constructor : Programmer defined constructor without any arguments
//3)Parameterized constructor : Programmer defined constructor, parameters are passed in this constructor

