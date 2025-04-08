package lesson_15_ExceptionHandling;


public class TestExceptionFinally {

	public static void main(String[] args) {
		
		int num1;
		int num2=0;
		String name = "Amit";
		int[] age = {12,17,11,14};
		
		try 
		{
		   System.out.println(name.length());
		   num1 = 10;
		   num2 = num1/0;  //Exception Occures, Java Throw an Exception Object
		   System.out.println(age[1]);
		}
			
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("In Finally Block");
		}
		
		
		System.out.println(num2);
		System.out.println("Rest of program 1");
		System.out.println("Rest of program 2");
		System.out.println("Rest of program 3");
		
		
		

	}

}
