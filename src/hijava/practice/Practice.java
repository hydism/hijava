package hijava.practice;

public class Practice {
	public static void main(String[] args) {
		sumByWhile();
		sumByFor();
	}

	private static void sumByFor() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("for문 : " + sum);
		
	}

	private static void sumByWhile() {
		int i = 0;
		int sum1 = 0;
		while (i++ < 100) {
			sum1 = sum1 + i;	
			}
		System.out.println("1부터 100까지 모든 자연수의 합 : " + sum1);
		
		int k = 0;
		int sum2 = 0;
		while (k++ < 100) {
			if (k % 2 == 0)
				continue;
			sum2 = sum2 + k;
			
		}
		System.out.println("1부터 100까지의 모든 홀수의 합 : " + sum2);
	}
}
