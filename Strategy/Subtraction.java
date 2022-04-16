package Strategy;

public class Subtraction implements CalculatorStrategy {

	@Override
	public void calculate(int[] numbers) {
		System.out.println("Operacion: " + numbers[0] + " - " + numbers[1]);
		int result = numbers[0] - numbers[1];
		System.out.println("Resultado: " + result);
	}
}