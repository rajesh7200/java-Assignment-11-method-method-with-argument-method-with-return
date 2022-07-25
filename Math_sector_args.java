class Sector
{
	void area(int r,double angle)
	{
		double res=3.14*r*r*(angle/360);
		System.out.println("The area of sector is "+res);
	}
	
}

class Math_sector_args
{
	public static void main(String [] args)
	{
		new Sector().area(10,30);
	}
}