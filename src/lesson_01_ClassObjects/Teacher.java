package lesson_01_ClassObjects;

public class Teacher {
	
	String teacherName = "Amit";
	int teacherAge = 25;
	
	public void printTeacherInfo()
	{
		System.out.println("Teacher Name = " + teacherName);
		System.out.println("Teacher Age = " + teacherAge );
		
	}

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();		
		t1.printTeacherInfo();
		
		Student s6 = new Student();
		s6.printStudentInfo();
		

	}

}
