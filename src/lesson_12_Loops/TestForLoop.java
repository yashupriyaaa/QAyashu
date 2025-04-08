package lesson_12_Loops;

public class TestForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 1; i <= 10; i++)
		{
			
			System.out.println(i);
			
			if(i==6)
			{
			  System.out.println("Got 6");
			  break;
				
			}
			
			
		}
		
		System.out.println("Outside Loop");
		

	}

}
