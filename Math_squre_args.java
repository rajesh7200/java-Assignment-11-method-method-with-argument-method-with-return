class Squre
{
	void area(int side)
	{
		int res=side*side;
		System.out.println("The area of Squre is "+res);
	}
	
}

class Math_squre_args
{
	public static void main(String [] args)
	{
		new Squre().area(10);
	}
}