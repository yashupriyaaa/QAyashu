package lesson_03_MethodOverloading;

public class Calculations {
	
	  int num1 = 10;
	  int num2 = 20;
			  
	  public void Sum()
	  {
		  System.out.println("Sum of Two Integers = " + (num1+num2));
	  }
	 	  
	  public void Sum(int n1, int n2)
	  {
		  System.out.println("Sum of Two Integers = " + (n1+n2));
	  }
	  
	  public void Sum(int n1, int n2, int n3)
	  {
		  System.out.println("Sum of Three Integers = " + (n1+n2+n3));
	  }
	  
	  public void Sum(double d1, double d2)
	  {
		  System.out.println("Sum of Two Decimals = " + (d1+d2));
	  }
	  
	  public void Sum(double d1, double d2, double d3)
	  {
		  System.out.println("Sum of Three Integers = " + (d1+d2+d3));
	  }
	  
	  
	  

	public static void main(String[] args) {
		
		Calculations c1 = new Calculations();
		c1.Sum(12, 15);
		c1.Sum(2, 4, 7);
		c1.Sum(2.4, 5.1);
		c1.Sum();

	}

}
