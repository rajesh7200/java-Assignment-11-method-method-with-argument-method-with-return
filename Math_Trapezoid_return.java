class Trapezoid
{
	double area(int a,int b,int h)
	{
		double res=0.5*(a+b)*h;
		return res;
	}
	
}

class Math_Trapezoid_return
{
	public static void main(String [] args)
	{
		double x=new Trapezoid().area(10,20,30);
		System.out.println("The area of Trapezoid is "+x);
	}
}