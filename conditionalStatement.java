package functions;

public class conditionalStatement {

	public int Calculation(int a, int b, String condition) {
		int c = 0;
		if (condition == "SUM") {
			c = a + b;
			System.out.println("SUM is  " + c);
		} else if (condition == "Subtract") {
			c = a - b;
			System.out.println("Subtract is  " + c);
		} else if (condition == "Multiply") {
			c = a * b;
			System.out.println("Multiply is  " + c);

		} else if (condition == "Divide") {

			c = a / b;
			System.out.println("Divide is  " + c);
		}
		return c;
	}
}