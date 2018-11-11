package chainPattern;

public class Numbers {
    private double number1, number2;
    private String calculationwanted;
	public Numbers(double number1, double number2, String calculationwanted) {
		this.number1 = number1;
		this.number2 = number2;
		this.calculationwanted = calculationwanted;
	}
	public double getNumber1() {
		return number1;
	}
	public double getNumber2() {
		return number2;
	}
	public String getCalculationwanted() {
		return calculationwanted;
	}
    
    
}