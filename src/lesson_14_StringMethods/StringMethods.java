package lesson_14_StringMethods;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subject = "SeleniumWithJava";
		String favSubject = "seleniumwithjava";
		
		int strlen = subject.length();
		System.out.println("String Length = " + strlen);
		
		char characterAt = subject.charAt(8);
		System.out.println("Character at given index = " + characterAt);
		
		int indexOfCharacter = subject.indexOf('e');
		System.out.println("index of given Character = " + indexOfCharacter);
		
		int lastIndexOfCharacter = subject.lastIndexOf('e');
		System.out.println("las t index of given Character = " + lastIndexOfCharacter);
		
		boolean isContained = subject.contains("With");
		System.out.println("Is Contained = " + isContained);
		
		boolean isStartedWith = subject.startsWith("Sele");
		System.out.println("Is Started With  = " + isStartedWith);
		
		boolean isEndedWith = subject.endsWith("va");
		System.out.println("Is Ended With  = " + isEndedWith);
		
		boolean isEqual = subject.equals(favSubject);
		System.out.println("Is Strings Equal  = " + isEqual);
		
		boolean isEqualIgnoreCase = subject.equalsIgnoreCase(favSubject);
		System.out.println("Is Strings Equal Ignore Casing  = " + isEqualIgnoreCase);
		
        String testSubstr = subject.substring(8);
        System.out.println("Here is Substring = " + testSubstr);
        
        String testSubstr2 =  subject.substring(8, 12);
        System.out.println("Here is Substring2 = " + testSubstr2);
        
        String skillset = "Se=leniumJ=ava=Te=stN=GPOM";
        String[] skillSets = skillset.split("=");
        for(String skill : skillSets)
        {
        	System.out.println(skill);
        }
		
	}

}
