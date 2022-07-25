class Triangle
{
	void area(int base,int height)
	{
		double res=0.5*base*height;
		System.out.println("The area of Triangle is "+res);
	}
	
}

class Math_Triangle_args
{
	public static void main(String [] args)
	{
		new Triangle().area(10,20);
	}
}