
public class ForBasic {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("I live Java" + i);
		}
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합은 " + sum);
	}
}
