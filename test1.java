abstract class vehicle{
int no_of_tyres;
abstract void start();
void stop()
{
	System.out.println("Stops on applying brakes");
}
}
class car extends vehicle
{
	void start()
	{
		System.out.println("Starts with a key");
	}
}
class scooter extends vehicle
{
	void start()
	{
		System.out.println("Starts with a kick");
	}
}
class test1 
{
	public static void main(String args[])
	{
		car car=new car();
		car.start();
		car.stop();
		scooter scooter = new scooter();
		scooter.start();
		scooter.stop();
	}
}

//cannot create object of an abstract class, it can only be extended 
//It can have both abstract and non-abstract methods 
//If there exists a method that is abstract, the class it is contained in has to be abstract. 
//We can achieve 0-100% abstraction through abstract class
//abstraction is the process of hiding internal details and showing the essential information to the end user
//For e.g. here we are not providing the body of start() method in class vehicle
//We're showing only the main services such as the name of fields and methods.