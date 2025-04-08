package lesson_21_AbstractClass;

public class Swift extends Car{
	
	@Override
	void start() {
		System.out.println("Swift is started");	
	}

	@Override
	void stop() {
		System.out.println("Swift is stopped");	
		
	}
	

	public static void main(String[] args) {
	
		Swift s1 = new Swift();
		s1.stop();
		s1.start();
	}

	

}
