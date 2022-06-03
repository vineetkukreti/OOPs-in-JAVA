package oops;
class Real
{
	private int length ;
	private int breath ;
	private int height;
	Real(int l,int b,int h)
	{
		length  = l;
		breath = b;
		height = h;
	}
	public void displayBox()
	{
		System.out.println("Length : "+length);
		System.out.println("Height : "+height);
		System.out.println("Breath : "+breath);
	}
}
class Box {

	public static void main(String args[])
	{
		
		Real op = new Real(1,2,3);
		op.displayBox();
	}
}
