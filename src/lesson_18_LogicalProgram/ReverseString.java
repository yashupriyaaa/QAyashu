package lesson_18_LogicalProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subject = "javaselenium";
		String reverse = "";
		
		for(int i= subject.length()-1; i>=0 ; i--)
		{
			
			reverse = reverse + subject.charAt(i);
			
		}
		
		System.out.println(reverse);
		

	}

}
