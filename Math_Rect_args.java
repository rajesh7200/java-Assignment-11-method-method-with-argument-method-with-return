class Rect
{
	void area(int w,int l)
	{
		int res=w*l;
		System.out.println("The area of Rect is "+res);
	}
	
}

class Math_Rect_args
{
	public static void main(String [] args)
	{
		new Rect().area(10,20);
	}
}