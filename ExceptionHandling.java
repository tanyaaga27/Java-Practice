//

//Difference between exception and Error
//Exception :- Occurs due to our programs
//Error:- Occurs due to lack of system resources
//Exception are recoverable
//Errors are not recoverable
//Exception are of 2 types:- 1)CT/checked exception 2)RT/unchecked exception
//Errors occur only at Runtime.
//Difference b/w CT and RT Exceptions?
//CT exceptions are exceptions which compiler can check 
//RT exceptions are exceptions which can't be checked by the compiler
//Both occur at runtime

//Difference between throw and throws
//throw is used by a user to throw a user defined exception and passed to the JVM (not used for predefined exception)
//Always prefer to create unchecked exception by extending class RuntimeException

//Exception Handling Practice
/*class ExceptionHandling
{
	public static void main(String args[])
	{
		int[] arr = {5,50,40,0,30,100};
		
		for(int i : arr)
		{
			try{
				int a = 100/i;
				System.out.println(a);
			}catch(Exception e)
			{
				System.out.println("Can't divide by zero");
			}
		}
		System.out.println("End of program");
	}
}*/

/*throw keyword code practice*/
/*class YoungerAgeception extends RuntimeException
{
	YoungerAgeception(String msg)
	{
		super(msg);
	}
}
class ExceptionHandling
{
	public static void main(String args[])
	{
		int age = 20;
		try{
		if(age<18)
		{
			throw new YoungerAgeception("You are not eligible to vote");
		}
		else
			System.out.println("Vote success");
		}catch(YoungerAgeception e)
		{
			e.printStackTrace();
		}
		System.out.println("Try again when you're eligible");
	}
}*/

//throws keyword is always used for checked exception
//It indicates the caller method that an unchecked exception may occur which you have to handle
//It could be taken care of in the caller method using ty-catch keyword or caller method could also use throws keyword 
//In the latter scenario, if JVM is the caller method, it will have to handle it, in that case JVM will terminate the main method in case of occurence of an exception
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class ReadAndWrite
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
}
class ExceptionHandling 
{
	public static void main(String args[])
	{
		ReadAndWrite rw = new ReadAndWrite();
		try{
		rw.readFile();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("I come after try catch");
	}
}