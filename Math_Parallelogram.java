class Parallelogram
{
	void area()
	{
		int base=20,height=10;
		double res=base*height;
		System.out.println("The area of Parallelogram is "+res);
	}
	
}

class Math_Parallelogram
{
	public static void main(String [] args)
	{
		new Parallelogram().area();
	}
}