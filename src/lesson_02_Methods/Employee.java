package lesson_02_Methods;

public class Employee {
	
	String FName = "Pankaj";
	String MName = "Kumar";
	String LName = "Singh";
	
	public void printEmpInfo()
	{
		
		System.out.println("Full Name of Emp = " + (FName + MName + LName));
	}
	
	public String getEmpFullName()
	{
				
		return FName + MName + LName;		
	}
	

	public static void main(String[] args) {
				
		Employee E1 = new Employee();
		E1.printEmpInfo();
		
		String fullName = E1.getEmpFullName();
		System.out.println(fullName);
		
		Student s1 = new Student();
		s1.printStudentInfo("Sunit", "Mech", 5001);

	}

}
