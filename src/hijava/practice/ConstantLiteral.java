package hijava.practice;

public class ConstantLiteral {
	public static final int STU_NUM = 10;
	public static void main(String[] args) {
		final String s = "abc" ;
		add1(s);
		System.out.println(s);
//		s = "def"; // ���� �ٲܼ� ����
//		STU_NUM = 2 ; // ���� �ٲ� �� ����
	}
	
	public static String add1(String x) {
		 x = x + "1";
		 return x ;
	}
}
