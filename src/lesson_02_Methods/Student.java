package lesson_02_Methods;

public class Student {
	
	String studentName;
	String branch;
	int RegNumber;
	
	public void printStudentInfo(String SN, String BN, int RG)
	{
		studentName = SN;
		branch = BN;
		RegNumber = RG;		
		System.out.println(studentName+branch+RegNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.printStudentInfo("Amit", "CS", 1001);
		Student s2 = new Student();
		s2.printStudentInfo("Pankaj", "ELC", 2001);
		Student s3 = new Student();
		s3.printStudentInfo("Pooja", "ECE", 3001);
		

	}

}
