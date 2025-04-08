package lesson_10_Superkeyword;

public class Creta extends Car{
	
	int maxspeed = 150;
	
	public Creta()
	{
		System.out.println("In Creta Constructor");
	}
	
	public Creta(String fuel)
	{
		super("White");
		System.out.println("Fuel Type = " + fuel);
	}
	
	public void run()
	{
		super.run();
		System.out.println("Creta is Running");
		super.stop();
		System.out.println(super.maxspeed);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Creta c1 = new Creta();
		c1.run();
		
		Creta c2 = new Creta("Petrol");
		
		

	}

}
