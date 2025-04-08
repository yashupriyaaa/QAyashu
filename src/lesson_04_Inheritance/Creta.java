package lesson_04_Inheritance;

public class Creta extends Car{

	public void driver() {
		
		System.out.println("driver drives the car");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Creta c1 = new Creta();
		c1.run();
        c1.driver();
	}

}
