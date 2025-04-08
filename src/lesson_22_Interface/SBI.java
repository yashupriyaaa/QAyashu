package lesson_22_Interface;

public class SBI implements Bank {

	@Override
	public double rateofInterest() {
		
		return 5.5;
	}

	@Override
	public double rateofDeposit() {
		
		return 3.5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank s1 = new SBI();
		System.out.println(s1.rateofDeposit());
		Bank s2 = new SBI();
		System.out.println(s2.rateofInterest());

	}

}
