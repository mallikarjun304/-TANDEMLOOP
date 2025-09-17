package ten_k_coders;

public class Program4 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
			System.out.print("{");
			for (int divisor = 1; divisor <= 9; divisor++) {
				int count = 0;
				for (int num : numbers) {
					if (num % divisor == 0) {
						count++;
					}
				}
				System.out.print(divisor + ": " + count);
				if (divisor < 9) {
					System.out.print(", ");
				}
			}
			System.out.println("}");
	}
}
