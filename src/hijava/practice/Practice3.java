package hijava.practice;

public class Practice3 {

	public static void main(String[] args) {
		// 1~100까지 소수들의 합
		int sum = 0;
		System.out.print("소수 : ");
		for(int i = 2; i <= 100; i++) {
			int cnt = 0;
			for(int j = 2; j <= i - 1; j++) {
				
				if(i % j == 0) {
					cnt++;
					}
				}
			
				if(cnt == 0) {
					
					System.out.print(i + " ");
					sum += i;
				}
			}
		System.out.println();
		System.out.println("1~100까지 소수들의 총 합 : " + sum);
		}
	}
