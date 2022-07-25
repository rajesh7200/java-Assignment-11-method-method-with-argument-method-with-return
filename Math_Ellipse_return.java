class Ellipse
{
	double area(int a,int b)
	{
		double res=3.142*a*b;
		return res;
	}
	
}

class Math_Ellipse_return
{
	public static void main(String [] args)
	{
		double x=new Ellipse().area(10,20);
		System.out.println("The area of Ellipse is "+x);
	}
}