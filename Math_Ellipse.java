class Ellipse
{
	void area()
	{
		int a=10,b=20;
		double res=3.142*a*b;
		System.out.println("The area of Ellipse is "+res);
	}
	
}

class Math_Ellipse
{
	public static void main(String [] args)
	{
		new Ellipse().area();
	}
}