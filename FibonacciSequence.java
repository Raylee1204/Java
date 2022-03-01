package homework;

public class FibonacciSequence_407170288 {

	public static void main(String[] args) {
		int a = 1;

		int FibonacciSequence = 48;
		long[] Fibonacci = new long[FibonacciSequence];

		Fibonacci[0] = 0;
		Fibonacci[1] = 1;

		for (int i = 2; i < FibonacciSequence; i++) {

			Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];

		}
		System.out.println("FibonacciSequence = " + FibonacciSequence);

		for (int i = 0; i < FibonacciSequence; i++) {
			System.out.println(a++ + "." + Fibonacci[i]);
		}

	}

}
