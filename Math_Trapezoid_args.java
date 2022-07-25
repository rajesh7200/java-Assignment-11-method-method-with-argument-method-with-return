class Trapezoid
{
	void area(int a,int b,int h)
	{
		double res=0.5*(a+b)*h;
		System.out.println("The area of Trapezoid is "+res);
	}
	
}

class Math_Trapezoid_args
{
	public static void main(String [] args)
	{
		new Trapezoid().area(10,20,30);
	}
}