class Circle
{
	void area(int r)
	{
		double res=3.14*r*r;
		System.out.println("The area of circle is "+res);
	}
	
}

class Math_circle_args
{
	public static void main(String [] args)
	{
		new Circle().area(10);
	}
}