package lesson_13_Conditions;

public class IfElseCondition {

	public static void main(String[] args) {
		
		int age = 10;
		int pincode = 140302;
				
		if(age >= 18 || pincode == 140301)
		{
			System.out.println("Eligible to VOTE in Kharar");
		}
		else
		{
			System.out.println("NOT Eligible to VOTE");
		}
		
		String state = "Chandigarh";
		
		if(state.equals("punjab"))
		{
			System.out.println("Welcome to punjab");
		}
		else
		{
			System.out.println("Welcome here");
		}
		
		

	}

}
