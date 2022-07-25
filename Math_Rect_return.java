class Rect
{
	int area(int w,int l)
	{
		int res=w*l;
		return res;
	}
	
}

class Math_Rect_return
{
	public static void main(String [] args)
	{
		int x=new Rect().area(10,20);
		System.out.println("The area of Rect is "+x);

	}
}