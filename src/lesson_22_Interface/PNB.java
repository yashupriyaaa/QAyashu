package lesson_22_Interface;

public class PNB implements Bank {

	@Override
	public double rateofInterest() {
		// TODO Auto-generated method stub
		return 7.5;
	}

	@Override
	public double rateofDeposit() {
		// TODO Auto-generated method stub
		return 4.5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank p1 = new PNB();
		System.out.println(p1.rateofDeposit());
		
		

	}

}
