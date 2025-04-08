package lesson_07_StaticKeyword;

public class Counter2 {
	
	static int count = 1;
	static String name = "Amit";
	
	public static void increment()
	{
		
		count++;
		System.out.println(count);
	}
	
	public static void sayHello()
	{
		
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		increment();
		increment();
		increment();
		sayHello();

	}

}
