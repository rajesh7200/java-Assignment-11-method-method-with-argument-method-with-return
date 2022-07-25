class Sector
{
	double area(int r,double angle)
	{
		double res=3.14*r*r*(angle/360);
		return res;
	}
	
}

class Math_sector_return
{
	public static void main(String [] args)
	{
		double x=new Sector().area(10,30);
		System.out.println("The area of sector is "+x);
	}
}