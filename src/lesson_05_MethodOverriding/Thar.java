package lesson_05_MethodOverriding;

public class Thar extends Car{
	
	public void driver()
	{
		
		System.out.println("I am Driving Thar");
	}
	
	public void run()
	{
		System.out.println("Thar is Running");
		
	}
	
	
	public static void main(String[] args) {
		
		
		Thar t1 = new Thar();
		t1.driver();
			
		t1.run();

	}

}
