package Strategy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("Patrón Strategy");
		System.out.println("----------------------------------------");
		System.out.println ("Por favor introduzca el primer numero a operar:");
		int number1, number2;
        Scanner entrada = new Scanner(System.in);
        number1 = Integer.parseInt(entrada.nextLine());
		System.out.println ("Por favor introduzca el segundo numero a operar:");
		number2 = Integer.parseInt(entrada.nextLine());
		System.out.println("----------------------------------------");
		entrada.close();
		int numbers[] = {number1, number2};
		CalculatorContext context = new CalculatorContext();
		context.setCalculatorMethod(new Addition());
		context.calculateResult(numbers);
	}
}