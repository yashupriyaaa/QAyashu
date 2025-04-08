package lesson_12_Loops;

public class TestForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String studentName[] = {"Amit", "Rohit", "Pooja", "Raman", "Riya", "Rohan", "Pankaj"};
		
		
		for(int i =0; i <studentName.length; i++)
		{
			System.out.println(studentName[i]);
		}
		
		
		System.out.println("=================");
		
		for(String s : studentName)  
		{
			System.out.println(s); 
						
		}
		
		
		
	}

}
