
public class Gugudan {

	public static void main(String[] args) {

		int i, j, m, n;

		for (i = 2; i <= 9; i++) {
			if (i % 3 != 0)
				continue;
			for (j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "= " + i * j);
			}
		}
		
		for (m = 1; m <= 5; m++) {
			for (n = 1; n <= m; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
