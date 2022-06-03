package oops;

public class A1 {
	int a;
	String name;
//	A1()
//	{
//		System.out.println("Constructor is calledess22");
//	}
	A1(String name,int n)
	{
		this.name = name;
		a = n;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(a);
	}
	public static void main(String[] args) {
		A1 s = new A1("chutiya",89);
//		System.out.println("a    = "+s.a);
//		System.out.println("name = "+s.name);
		s.display();

	}

}
