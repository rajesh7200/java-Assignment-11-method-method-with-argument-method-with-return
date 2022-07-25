class Sector
{
	void area()
	{
		int r=10;
		double angle=60.0;
		double res=3.14*r*r*(angle/360);
		System.out.println("The area of sector is "+res);
	}
	
}

class Math_sector
{
	public static void main(String [] args)
	{
		new Sector().area();
	}
}