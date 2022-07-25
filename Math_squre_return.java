class Squre
{
	int area(int side)
	{
		int res=side*side;
		return res;
	}
	
}

class Math_squre_return
{
	public static void main(String [] args)
	{
		int x=new Squre().area(10);
		System.out.println("The area of Squre is "+x);
	}
}