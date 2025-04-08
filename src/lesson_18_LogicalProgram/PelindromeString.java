package lesson_18_LogicalProgram;

public class PelindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subject = "racecar";
		String reverse = "";
		
		for(int i= subject.length()-1; i>=0 ; i--)
		{
			
			reverse = reverse + subject.charAt(i);
			
		}
		
		if(subject.equals(reverse))
		{
			
			System.out.println("String is Pelindrome");
		}
		
		else
		{
			System.out.println("String is NOT Pelindrome");
		}

	}

}
