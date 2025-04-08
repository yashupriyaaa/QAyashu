package lesson_17_HashMap;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		//Stores information in KEY VALUE Pair
		//Duplicate Keys are not allowed
		HashMap<Integer, String>  students = new HashMap<>();
		
		System.out.println(students);
		
		System.out.println(students.isEmpty());
		
		students.put(1001, "Amit");
		students.put(2001, "Raman");
		students.put(3001, "Pankaj");
		students.put(4001, "Pooja");
		
		System.out.println(students);
		
		students.put(1001, "Hemant");
		System.out.println(students);
		students.put(null, "Hemant");
		System.out.println(students);
		
		//containsKey checks if a KEY is contained in your HashMap, Returns a boolean
		System.out.println(students.containsKey(1001)); 
		
		//containsValue checks if a VALUE is contained in your HashMap, Returns a boolean
		System.out.println(students.containsValue("Sanju"));
		
		students.remove(1001);
		System.out.println(students);
		
		System.out.println(students.size());
		
	}
	

}
