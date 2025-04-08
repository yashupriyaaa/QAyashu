package lesson_16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<>();
		
		System.out.println(students);
		System.out.println(students.isEmpty());
		
		//Add an element without index (Zero based indexing by default)
		students.add("Amit");
		students.add("Ajay");
		students.add("Arun");
		students.add("Ajeet");
		students.add("Raman");
		System.out.println(students);
		
		//Add Method with Index 
		students.add(2, "Pooja");
		System.out.println(students);
		
		//Get Method
		System.out.println(students.get(4));
		
		//Size method returns number of elements in Arraylist
		System.out.println(students.size());
		
		//Remove method removes an element using the index passed.
		students.remove(2);
		System.out.println(students);
		
		//Remove method removes an element using the Value passed.
		students.remove("Raman");
		System.out.println(students);
		
		System.out.println(students.isEmpty());
		
		for(String student : students)
		{
			System.out.println(student);
		}
		
		Collections.sort(students);
		System.out.println(students);
		
		

	}

}
