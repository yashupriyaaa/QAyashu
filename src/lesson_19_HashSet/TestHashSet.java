package lesson_19_HashSet;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		
		System.out.println(set.isEmpty());		
		System.out.println(set);
		
		set.add("Amit");
		set.add("Rohit");
		set.add("Rohan");
		
		System.out.println(set);
		
		set.add("Amit");
		set.add("Rohit");
		set.add("Rohan");
		
		//Set does not allow Duplicate Value.
		//Set does not maintain insertion order.
		System.out.println(set);
		
		set.remove("Amit");
		System.out.println(set);
		
		for (String name : set) {
            System.out.println(name);
        }
		
		
		
	}

}
