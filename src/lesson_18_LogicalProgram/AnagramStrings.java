package lesson_18_LogicalProgram;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "silent";
		String name2 = "listen";
		
		char[] chArr = name.toCharArray();
		
		char[] chArr2 = name2.toCharArray();
		
		Arrays.sort(chArr);
		Arrays.sort(chArr2);
		
		if(Arrays.equals(chArr, chArr2))
		{
			
			System.out.println("Anagram");
		}
		
		else
		{
			System.out.println(" NOT Anagram");
		}

	}

}
