package homework;

public class LotteryNumStats_407170288 {
	int data[] = new int[42];
	int num[] = new int[42];

	public void count() {

		for (int i = 1; i <= 100000; i++) {
			int rnum = (int) (Math.random() * 42 + 1);
			data[rnum - 1]++;
		}
	}

	public void sortarray() {

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		while (true) {
			int count = 0;
			for (int i = 0; i < data.length - 1; i++) {
				int temp1 = 0, temp2 = 0;
				if (data[i] < data[i + 1]) {

					temp1 = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp1;

					temp2 = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp2;
					count++;
				}
			}
			if (count == 0) {
				break;
			}
		}

		for (int i = 0; i < 42; i++) {

			System.out.println(" " + num[i] + " " + data[i] + " ");
		}

	}

	public void printarray() {

		for (int i = 0; i < data.length; i++) {

			System.out.println(" " + (i + 1) + " " + data[i] + " ");
		}
	}

	public static void main(String[] args) {
		LotteryNumStats_407170288 test1 = new LotteryNumStats_407170288();
		test1.count();

		System.out.println("original data: ");
		System.out.println("-------------------------------------- ");
		test1.printarray();
		System.out.println("-------------------------------------- ");
		System.out.println("Sorted Data: ");
		System.out.println("-------------------------------------- ");
		test1.sortarray();
		System.out.println("-------------------------------------- ");

	}

}