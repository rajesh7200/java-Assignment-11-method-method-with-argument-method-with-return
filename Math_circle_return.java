class Circle
{
	
	double area(int r)
	{
		double res=3.14*r*r;
		return res;
	}
	
}

class Math_circle_return
{
	public static void main(String [] args)
	{
		double x=new Circle().area(10);
		System.out.println("The area of circle is "+x);
	}
}