package hijava.practice;

public class ConstantLiteral {
	public static final int STU_NUM = 10;
	public static void main(String[] args) {
		final String s = "abc" ;
		add1(s);
		System.out.println(s);
//		s = "def"; // 값을 바꿀수 없음
//		STU_NUM = 2 ; // 값을 바꿀 수 없음
	}
	
	public static String add1(String x) {
		 x = x + "1";
		 return x ;
	}
}
