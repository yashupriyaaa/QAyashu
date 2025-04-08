package lesson_10_Superkeyword;

public class Car {
	
	public Car()
	{
		System.out.println("In Car Constructor");
		
	}
	
	public Car(String color)
	{
		System.out.println("Car color is = " + color);
		
	}
	
	
	int maxspeed = 120;
	
	public void run()
	{
		System.out.println("Car is Running");
		
	}
	
	public void stop()
	{
		System.out.println("Car is stopped");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
