package oops;

class Dupa
{
	int speed = 10;
}
class Po extends Dupa
{
	int speed = 45;
	public void display()
	{
		System.out.println("Speed : "+speed);
		// System.out.println("Speed : "+super.speed); //to avoid overrinding
	}
}
public class SuperKeywordAsFunction {

	public static void main(String[] args) {
		Po a = new Po ();
		a.display();

	}

}






