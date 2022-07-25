class Ellipse
{
	void area(int a,int b)
	{
		double res=3.142*a*b;
		System.out.println("The area of Ellipse is "+res);
	}
	
}

class Math_Ellipse_args
{
	public static void main(String [] args)
	{
		new Ellipse().area(10,20);
	}
}