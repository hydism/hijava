package hijava.practice;

public class Num {
	public static void main(String [] args) {
		byte b = 1;
		short s = 32767;
		int i = 2147483647;
		long l = 2147483648L; // 범위자체는 long의 범위내에 있으나, 숫자는 기본형이 int이기 때문에 4byte메모리로 인식해서 오류
						      // 숫자뒤에 L붙여주면 됨
		
		float f = 0.1f;
		double d = 123.45;
		
		System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
	}
}
