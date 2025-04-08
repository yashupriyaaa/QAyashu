package lesson_09_ThisKeyword;

public class Student {
	
	String name;
	int rollNo;
	
	public void printStudentInfo()
	{
		
		System.out.println("Name of Student = " + name);
		System.out.println("Roll No of Student = " + rollNo);
	}
	
	public Student()
	{
	    System.out.println("In Default Constructor");
		name = "Amit";
		rollNo = 145;
	
	}
	
	public Student(String name, int rollNo)
	{
		System.out.println("In Parametrized Constructor");
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();		
		s1.printStudentInfo();		
		
		Student s4 = new Student("Rahul", 555);
		s4.printStudentInfo();
		
		
		

	}

}
