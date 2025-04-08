package lesson_18_LogicalProgram;

import java.util.HashMap;

public class CountOccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "learnautomationtesting";
		
		 HashMap<Character, Integer> map = new HashMap<>();
		 
		 for(char ch : str.toCharArray())
		 {
			 
			 if(!map.containsKey(ch))
			 {
				 map.put(ch, 1);
				 
			 }
			 
			 else
			 {
				 map.put(ch, map.get(ch)+1);
			 }
			 
			 
		 }
		 
		 System.out.println(map);
		 
		 
		 
		 

	}

}
