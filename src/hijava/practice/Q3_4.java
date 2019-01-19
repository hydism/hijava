package hijava.practice;

public class Q3_4 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = num1 > 10 && num2 > 10; //괄호없이 해도 됨
		System.out.println(result);
		
		result = ((num1 > 10) || (num2 > 10));
//		result = (num1 > 10) || (num2 > 10); //위와 동일
//		result = num1 > 10 || num2 > 10; //위와 동일
		System.out.println(result);
		System.out.println(!result);
		
		//false가 0, true가 1이다.
	}

}
