package homework;

public class Table9x9_407170288 {

	public static void main(String[] args) {
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if (a * b < 10) {
					System.out.println(a + "x" + b + "=\0" + (a * b));
				} else {
					System.out.println(a + "x" + b + "=" + (a * b));
				}
			}
		}

	}

}
