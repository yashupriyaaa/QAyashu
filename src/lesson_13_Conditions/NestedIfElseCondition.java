package lesson_13_Conditions;

public class NestedIfElseCondition {

	public static void main(String[] args) {
		
		int age = 0;
		
				
		if(age >= 18)
		{
			System.out.println("Eligible to VOTE in Kharar");
		}
		else if(age >= 15)
		{
			System.out.println("You can register for vote");
		}
		else if(age >= 10)
		{
			System.out.println("Wait few years to vote");
		}
		else
		{
			System.out.println("You are a kid");
		}
		
		
		
		

	}

}
