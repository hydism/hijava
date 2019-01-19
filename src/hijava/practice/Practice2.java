package hijava.practice;

public class Practice2 {

	
	public static void main(String[] args) {
		//4번
		for (int i = 2; i <= 9; i = i + 2) {
			System.out.println("----" + i + "단----");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		
		//5번
		int line = 4;
		for(int i = 1; i <= line; i++) {
			for(int j = i; j < line; j++)	{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= 2 * i - 1; k ++) {
				System.out.print("*");
			}

			System.out.println();
//			for(int k = 1; k <= i; k ++) {
//			System.out.print("*");
//		}
//		
//		for(int l = 2; l <= i; l++) {
//			System.out.print("*");
//		}
		}
		
	}
}
