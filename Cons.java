package oops;
class Dp
{
	int a;
	String s;
	Dp(String name ,int n)
	{
		a = n;
		s = name;
	}
	Dp(Dp g)
	{
		a = g.a;
		s = g.s;
	}
	public void display()
	{
		System.out.println("A : "+a);
		System.out.println("S : "+s);
	}
}
public class Cons {

	public static void main(String[] args) 
	{
		Dp a1 = new Dp("vineet",78);
		a1.display();
		Dp a2 = new Dp(a1);
		a2.display();

	}

}
