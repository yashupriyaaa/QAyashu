package lesson_21_AbstractClass;

public class Creta extends Car{
	
	@Override
	void start() {
		System.out.println("Creata is started");
		
	}

	@Override
	void stop() {
		System.out.println("Creata is stopped");	
		
	}


	public static void main(String[] args) {
	
		Creta c1 = new Creta();
		c1.start();
		c1.stop();
		c1.run();

	}

	
}
