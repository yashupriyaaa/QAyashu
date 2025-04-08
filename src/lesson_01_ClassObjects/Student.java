package lesson_01_ClassObjects;

public class Student {
	
	String studentName = "Anuj";
	int studentAge = 15;
	
  //public = Method AceessModifier/Scope
  //void = Method Return Type
  //printStudentInfo = Method Name
	public void printStudentInfo()
	{
		System.out.println("Student Name = " + studentName);
        System.out.println("Student Age = " + studentAge);
	}

	
	public static void main(String[] args) {
		
      Student s1 = new Student();
      
      s1.printStudentInfo();
      
      Student s2 = new Student();
      s2.printStudentInfo();
      
	  Student s3 = new Student();
	  
	  s3.printStudentInfo();
	}

}
