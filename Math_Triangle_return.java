class Triangle
{
	double area(int base,int height)
	{
		double res=0.5*base*height;
		return res;
	}
	
}

class Math_Triangle_return
{
	public static void main(String [] args)
	{
		double x=new Triangle().area(10,20);
		System.out.println("The area of Triangle is "+x);
	}
}