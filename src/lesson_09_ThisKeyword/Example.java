package lesson_09_ThisKeyword;

public class Example {

	int x;
	
    Example() 
    {
        this(10);  // Calls the parameterized constructor
    }
    
    Example(int x) 
    {
        this.x = x;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   
		Example e1 = new Example();
		System.out.println(e1.x);
		
		Example e2 = new Example(50);
		System.out.println(e2.x);
		
	}

}
