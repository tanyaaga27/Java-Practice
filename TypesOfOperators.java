class TypesOfOperators
{
	public static void main(String args[])
	{
		//Urany Operator
		//1)Increment/decrement operator
		int a=5;
		System.out.println(a++);          //5 a=6
		System.out.println(++a);          //7 a=7
		System.out.println(a++ + --a);    //7+7=13 a=7
		
		//Negation ~a = -a-1
		a=10;
		System.out.println(~a); //-11
		a=-9;
		System.out.println(~a); //8
		
		//Arithematic operators
		a=10;  
                int b=5;  
                System.out.println(a+b);//15  
                System.out.println(a-b);//5  
                System.out.println(a*b);//50  
                System.out.println(a/b);//2  
                System.out.println(a%b);//0 
		
		//Logical Operator 
		//&& second condition doesn't get checked if first is false
		//|| second condition gets checked only if first is false
		a=10;  
                b=5;  
                int c=20;  
                System.out.println(a<b&&a<c);//false && true = false  
                System.out.println(a>b||a<c);//true || true = true  
		
		//Assignment Operator
		a=10;  
		b=5;
		a+=4;
		a-=5;
		System.out.println(a);
		System.out.println(b);
		a/=5;
		b*=2;
		System.out.println(a);
		System.out.println(b);
		
		//Relational Operators
		a=100;
		if(a==100)
			System.out.println(a);
		b=5;
		if(b>=10)
			System.out.println(b);
		else if(b<10)
			System.out.println(b);
		
		
		
		
		
		
	}
}
