package carCalculator;

public class carCalculator {
	private double CarCost;
	private double DownPayment;
	private int LengthOfLoan;
	private double InterestRate;
	
	public carCalculator(double p, double d, int l, double i) {
		this.CarCost = p;
		this.DownPayment= d;
		this.LengthOfLoan= l;
		this.InterestRate= i;
	}
	
	public double monthlyCarPayment() {
		double LeftOver = CarCost - DownPayment;
		return ((InterestRate/12.0)*LeftOver)/(1-Math.pow((1+ InterestRate/12.0), (-1) * LengthOfLoan));
	}
	public double InterestSpent() {
		return ((monthlyCarPayment() * LengthOfLoan) - (CarCost - DownPayment));
	}
}
