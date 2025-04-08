package lesson_08_Constructor;

public class Student {
	
	String name;
	int RollNo;
	
	public void printStudentInfo()
	{
		
		System.out.println("Name of Student = " + name);
		System.out.println("Roll No of Student = " + RollNo);
	}
	
	public Student()
	{
		name = "Amit";
		RollNo = 145;
	
	}
	
	public Student(String n, int r)
	{
		name = n;
		RollNo = r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();		
		s1.printStudentInfo();		
		
		Student s2 = new Student();
		s2.printStudentInfo();
		
		Student s3 = new Student();
		s3.printStudentInfo();
		
		Student s4 = new Student("Rahul", 555);
		s4.printStudentInfo();
		
		
		

	}

}
