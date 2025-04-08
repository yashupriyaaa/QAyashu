package lesson_11_Arrays;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String studentName[] = {"Amit", "Rohit", "Pooja", "Raman", "Riya", "Rohan", "Pankaj"};
		
		System.out.println(studentName[0]);
		System.out.println(studentName[4]);
		
		//length = Total Number of Elements in Array
		System.out.println(studentName.length);
		
		for(int i =0; i <=studentName.length-1; i++)
		{
			System.out.println(studentName[i]);
		}

	}

}
