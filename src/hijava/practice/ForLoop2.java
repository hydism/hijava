package hijava.practice;

public class ForLoop2 {

	public static void main(String[] args) {
		int line = 5;
		//1번
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= i; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//2번
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= line - i; j++)	{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}

//   *	     공백 3 별 1
//  ***   공백 2 별 1+2
// *****  공백 1 별 2+3
//******* 공백 0 별 3+4