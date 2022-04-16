package Strategy;

public class CalculatorContext {
    private CalculatorStrategy strategy;
	
	public void setCalculatorMethod(CalculatorStrategy strategy) {
		this.strategy = strategy;
	}
	
	public CalculatorStrategy getStrategy() {
		return this.strategy;
	}
	
	public void calculateResult(int[] numbers){
		this.strategy.calculate(numbers);
	}
}
