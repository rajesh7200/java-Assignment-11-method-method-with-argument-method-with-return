class Parallelogram
{
	void area(int b,int h)
	{
	
		double res=b*h;
		System.out.println("The area of Parallelogram is "+res);
	}
	
}

class Math_Parallelogram_args
{
	public static void main(String [] args)
	{
		new Parallelogram().area(10,20);
	}
}