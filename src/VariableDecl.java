
public class VariableDecl {

	public static void main(String[] args) {
		
		double num1, num2;	// 두 개의 변수 동시 선언
		double result;
		
		num1 = 1.0000001;
		num2 = 2.0000001;
		
		result = num1 + num2;
		System.out.println(result);
		
		/*
		 * result의 결과는 3.0000002 가 아닌
		 * 3.0000001999999997 가 출력됨
		 * 이유는 실수 표현에 오차가 존재하기 때문
		 */
		
		int num3, num4;
		int result2;
		
		num3 = 2100000000;
		num4 = 2100000000;
		
		result2 = num3 + num4;
		System.out.println(result2);
	}

}
