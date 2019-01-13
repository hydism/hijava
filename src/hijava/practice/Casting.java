package hijava.practice;

public class Casting {

	public static void main(String[] args) {
		byte b = 1;
		int i = b; //크기가 비교적 작은 자료형변환은 가능
//		
//		b = i; // 크기가 비교적 큰 자료형을 작은 자료형으로 변환하는건 불가능
		long l = 1234567;
		
		System.out.println(i + l + 10);
		System.out.println(i + l + b + 10); // 괄호안의 합이 long 자료형으로 자동적으로 변환됨.
		
		char c = 'A';
		int i2 = c ;
		System.out.println(i2);
		
		
		
	}

}
