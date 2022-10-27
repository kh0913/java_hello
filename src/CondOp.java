
public class CondOp {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		
		int big;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수 : " + big);
		
		if(num1 > num2) {
			System.out.println("큰 수 : " + num1);
		} else {
			System.out.println("큰 수 : " + num2);
		}
		
		//num3과 num4의 차이의 절대값을 구하는 프로그램을 짜시오
		
		int num3 = 5;
		int num4 = 7;
		
		int diff = num3 - num4;
		
		if(diff >= 0) {
			System.out.println(diff);
		} else {
			System.out.println(-diff);
		}
		
	}

}
