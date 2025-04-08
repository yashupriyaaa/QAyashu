package lesson_02_Methods;
import lesson_01_ClassObjects.Student;

public class Calculations {
	
	int num1 = 10;
	int num2 = 15;
	
	double d1 = 2.4;
	double d2 = 4.1;
	
  //method access/scope , returnType, Name	
	public void printSum()
	{
		System.out.println("Sum of Numbers = " + (num1+num2));
	}
	
	public int getSum()
	{
		int sum = num1+num2;
		return sum;
	}
	
	public void printDoubleSum()
	{
		System.out.println("Sum of Doubles = " + (d1+d2));
	}
	
	public double getDoubleSum()
	{
		return d1+d2;
	}
	
	

	public static void main(String[] args) {
		
		Calculations c1 = new Calculations();
		
		c1.printSum();
		
		int addition = c1.getSum();
		System.out.println("value given by getSum = " + addition);
		
		
		c1.printDoubleSum();
		
		double someofD = c1.getDoubleSum();
		System.out.println(someofD); 
		
		Student s1 = new Student();
		s1.printStudentInfo();
		
		
		
		

	}

}
