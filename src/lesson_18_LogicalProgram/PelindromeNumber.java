package lesson_18_LogicalProgram;

public class PelindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12321;
		
		int num2 = 0;
		
	    while(num > 0)
	    {
	    	
	    	int remainder = num%10;
	    	num2 = num2*10 + remainder;	    
	    	num = num/10; 	    	
	    	
	    }
	    
	    System.out.println(num2);
		

	}

}
