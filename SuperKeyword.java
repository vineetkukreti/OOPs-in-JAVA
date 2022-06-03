package oops;

class Dupper
{
	int speed = 10;
}
class Power extends Dupper
{
	int speed = 45;
	public void display()
	{
		System.out.println("Speed : "+speed);
		// System.out.println("Speed : "+super.speed); //to avoid overrinding
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Power a = new Power();
		a.display();

	}

}
