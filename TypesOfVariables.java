//Class variables are static variables. They belong to the class and not to the object. Shared by all the objects. 
//Instance variable are defined outside the method and inside the class. They are unique to each object. 
//Local variables are method variables. Defined inside mthods and blocks and their scope is limited. Gets created inside the method and gets destoyed after the execution of the method.

class TypesOfVariables{
	static int a=10;  //static/class variables
	int b;            //Instance variables
	String name; 
	void display()
	{
		int localvar=100;          //local variable
	}
}
