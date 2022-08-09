//Inner Class
//1)Member Inner Class : A non-static class that is created inside a class but outside a method is called member inner class.
//It can be declared with access modifiers like public, default, private, and protected.
class Test
{
	private int data = 10;
	class Inner
	{
		void display()
		{
			System.out.println("we're inside the inner class method");
			System.out.println("Data is :" + data);
		}
	}
} 
class InnerClass
{
	public static void main(String args[])
	{
		//Member Inner class calling
	    Test test = new Test();
	    Test.Inner obj = test.new Inner();
	    obj.display();
		
		//Anonymous Inner Class calling
		Person p = new Person(){
			void eat()
			{
				System.out.println("Eating fruits");
			}
		};
		p.eat();
		
		Eatable e = new Eatable(){
			public void eat()
			{
				System.out.println("Eating vegetables");
			}
		};
		e.eat();
		
		//Local Inner class calling
		LocalInner loc = new LocalInner();
		loc.display();
		
		//Static nested class calling
		TestOuter1.Inner outer =new TestOuter1.Inner();  
        outer.msg(); 
		TestOuter1.Inner.disp();
	}
}

//The java compiler creates two class files in the case of the inner class. 
//The class file name of the inner class is "Outer$Inner". 
//If you want to instantiate the inner class, you must have to create the instance of the outer class. 
//In such a case, an instance of inner class is created inside the instance of the outer class.

//The Java compiler creates a class file named Outer$Inner in this case. 
//The Member inner class has the reference of Outer class that is why it can access all the data members of Outer class including private.

////JAVA ANONYMOUS INNER CLASS
//Java anonymous inner class is an inner class without a name and for which only a single object is created.
//It should be used if you have to override a method of class or interface.
//Can be  created in 2 ways
//1)Class(Abstract/Concrete) 2)Interface
 //Using class
 abstract class Person
 {
	 abstract void eat();
 }
 //Called in main method.
 //A class is created, but its name is decided by the compiler, which extends the Person class and provides the implementation of the eat() method.
//An object of the Anonymous class is created that is referred to by 'p,' a reference variable of Person type.

//Using interface
interface Eatable{  
 void eat();  
}  
 //Called in main method.
 
 //LOCAL INNER CLASS
 //It's a class that's created inside a method
 //They're not a member of any enclosing classes. They belong to the block that contains them.
 //These classes have access to the fields of the class enclosing it.
 //To invoke the methods of the local inner class, you must instantiate this class inside the method.
class LocalInner
 {
	 private int data = 10 ;  //instance variable
	 void display()
	 {
		 int value = 70;      //Local variable
		 class local
		 {
			  void msg()
			 {
				 System.out.println("We're inside local inner class. Val. of instance var :"+ data+ ", Val. of Local var."+value);
			 }
		 }
		 local l = new local();
		 l.msg();
	 }
 }
 
 
 //Static nested class
 class TestOuter1
 {
     static int data=30;  
     static class Inner
	 {
         void msg()
	     {
		     System.out.println("Static Inner Class! data is "+data);
         }  
		 static void disp()
		 {
			 System.out.print("This is a static method. No need to create an object to call this object.");
		 }
     }  
 }
	 
 