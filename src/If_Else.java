
public class If_Else {

	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 7;
		
		// if문
		if(n1 < n2); {
			System.out.println("n1 > n2 is true");
		}
		
		// if ~ else 문
		if(n1 == n2) {
			System.out.println("n1 == n2 is true");
		}
		else {
			System.out.println("n1 == n2 is false");
		}
		
		int kor = 95;
		int eng = 85;
		int math = 75;
		
		double avg = (kor + eng + math) / (double)3.0;
		
		if(avg >= 90) {
			System.out.println("성적등급 : 수");
		} else if(avg >= 80) {
			System.out.println("성적등급 : 우");
		} else if(avg >= 70) {
			System.out.println("성적등급 : 미");
		} else if(avg >= 60) {
			System.out.println("성적등급 : 양");
		} else {
			System.out.println("성적등급 : 가");
		}
		
		
	}
}
