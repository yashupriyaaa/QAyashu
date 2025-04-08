package lesson_21_AbstractClass;

public abstract class Car {
	
	//Abstract class can not be initialized. Can not create Object of Abstract class
	//it is used as blueprint/contract for another classes and Utility class for another classes
	//Abstract class May or may not have Abstract Methods
	// Abstract classes implement Partial abstraction.
	
	abstract void start();
	abstract void stop();
	
	public void run()
	{
		System.out.println("Car is Running");
	}
	
	

}
