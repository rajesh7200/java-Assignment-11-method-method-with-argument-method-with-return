class Parallelogram
{
	double area(int b,int h)
	{
	
		double res=b*h;
		return res;
	}
	
}

class Math_Parallelogram_return
{
	public static void main(String [] args)
	{
		double x=new Parallelogram().area(10,20);
		System.out.println("The area of Parallelogram is "+x);
	}
}