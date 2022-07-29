//Inheritance is the process in which an object acquires all the properties of the parent object

class Animal
{
	void eat()
	{
		System.out.println("I am eating");
	}
}
class Dog extends Animal 
{
	void bark()
	{
		System.out.println("I am barking");
	}
}
class Beagle extends Dog
{
	void behave()
	{
		System.out.println("I am a cheerful dog");
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Beagle beagle = new Beagle();
		beagle.behave();
		beagle.bark();
		beagle.eat();
	}
}

//Here Animal is the parent/super class and Dog is child/sub class
//It is called an IS-A relationship. Dog IS-A Animal 
//Main advantage :- reusability of code for eg. here we did not have to write the eat method again. We can simply access it from parent class.
//Multiple Inheritance and hybrid inheritance not possible
//COnstructor and private methods are not inherited
//Object class is the parent class of all the classes in Java

//Inheritance is an IS-A relationship. 
//Association is a HAS-A relationship
//When object obj of class1 is created inside class2 then it's called class2 HAS-A obj. 
//Suppose a class c2 having instance variable name then its' called c2 HAS-A id.
//There are 2 types of Association Aggregation and Composition 

		