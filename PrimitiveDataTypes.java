class PrimitveDataTypes
{
	public static void main(String args[])
	{
		byte a=127;              //values ranges from -128 to 127
		short b;                 //value ranges from -2^15 to 2^15-1
		int c;                   //value ranges from -2^31 to 2^31-1
		long d;                  //value ranges from -2^63 to 2^63-1
		boolean flag;            //either true or false
		char c;                  //value ranges rom 0 to 2^16-1
		float f=3.12f;                 
		double d=3.123334D;
		System.out.print(a);
	}
}

//We represent basic fractional numbers in Java using the float type. This is a single-precision decimal number. This means that if we get past six decimal points, the number becomes less precise and more of an estimate.
//This type is stored in 32 bits of memory.
// It can represent both positive and negative numbers. The smallest decimal is 1.40239846*10^-45, and the largest value is 3.40282347*10^38.
//double is a double-precision decimal number. It's stored in 64 bits of memory. 
// The range is 4.9406564584124654 x 10-324 to 1.7976931348623157 x 10308.