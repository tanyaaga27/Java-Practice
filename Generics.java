//Java Generics allows us to create a single class, interface, and method that can be used with different types of data (objects).
//Generics does not work with primitive types (int, float, char, etc).
class GenericsClass<T>      //T indicates "type parameter"
{
	private T data;
	public GenericsClass(T data) 
	{
		this.data = data;
	}
	public T getterMethod()
	{
		return this.data;
	}
}
class GenericsMethod
{
	public <T> void genMethod(T data)
	{
		System.out.println("Generics Method");
		System.out.println("Data Passed:"+data);
	}
}
class BoundedTypes <T extends Number> {          //sub-type of Number are Integer, Double etc

  public void display() {
    System.out.println("This is a bounded type generics class.");
  }
}
class Generics
{
	public static void main(String args[])
	{
		GenericsClass<String> obj = new GenericsClass<>("Hello World");
		System.out.println(obj.getterMethod());
		
		GenericsClass<Integer> obj1 = new GenericsClass<>(100);
		System.out.println(obj1.getterMethod());
		
		GenericsMethod obj2 = new GenericsMethod();
		obj2.<String>genMethod("Learning Java");
		obj2.<Integer>genMethod(1000);
		
		BoundedTypes<Integer> obj4 = new BoundedTypes<>();
		obj4.display();
		//BoundedTypes<String> obj3 = new BoundedTypes<>(); //Will throw an error
		
		
	}
}

		