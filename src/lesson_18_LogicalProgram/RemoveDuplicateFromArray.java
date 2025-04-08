package lesson_18_LogicalProgram;

import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] studentIds = {101, 201, 321, 201, 333, 443, 101, 555, 987, 201};
		
		System.out.println("Original Ids with Duplicate values");
		
		for(int id : studentIds)
		{
			
			System.out.print(id + " ");
		}
		
		
		HashSet<Integer> idSet = new HashSet<>();
		
		for(int id : studentIds)
		{
			
			idSet.add(id);
		}
		
		System.out.println();
		System.out.println("Ids after Removing Duplicates");
		for(int id : idSet)
		{
			
			System.out.print(id + " ");
		}
		

	}

}
