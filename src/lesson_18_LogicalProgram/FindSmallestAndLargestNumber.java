package lesson_18_LogicalProgram;

import java.util.Arrays;

public class FindSmallestAndLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] age = {10, 35, 18, 26, 45, 22, 8, 15};
		
		Arrays.sort(age);		
		System.out.println(age[0]);		
		int arrLen = age.length;
		System.out.println(age[arrLen-1]);
		    // or
		int smallest = age[0];
		int largest =  age[0];
		
		for (int i = 1; i < age.length; i++)
		{
			
			if(age[i] < smallest)
			{
				smallest = age[i];
			}
			
			if(age[i] > largest)
			{
				largest = age[i];
			}
			
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
		
		
		
		
		

	}

}
