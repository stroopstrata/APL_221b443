
public class Main
{
	public static void main(String[] args) {
		Beverage b = new Whisky();
		b.give(50,2);
		System.out.println("\n");
		b= new Beer();
		b.give(10,5);
		System.out.println("\n");
		b=new Rum();
		b.give(100,1);
	}
}
