class Rect
{
	void area()
	{
		int w=10,l=20;
		int res=w*l;
		System.out.println("The area of Rect is "+res);
	}
	
}

class Math_Rect
{
	public static void main(String [] args)
	{
		new Rect().area();
	}
}