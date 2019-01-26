package hijava.practice;

public class Str {

	public static void main(String[] args) {
		charTest();
		substrTest();
	}

	private static void substrTest() {
		String s = "abc-defg";
		String s1 = s.substring(4);
		System.out.println(s1);
		String s2 = s.substring(2, 5);
		System.out.println(s2);
		String s3 = s.substring(0, s.length() - 4);
		System.out.println(s3);
	}
	private static void charTest() {
		char c = '한';		// cf. char c = 65;    or  char c = '\uD55C';
		byte b = 'A';
		System.out.println(c);
		System.out.println((int)c);    // cf. (char)c  or   (char)b
		System.out.println(b);

		String str = "AB";
		System.out.println(str);
		
		//getBytes() : 해당객체를 byte로 쪼개라
		System.out.println("AB".getBytes().length);
		System.out.println("AB한".getBytes().length);
		System.out.println("한".getBytes().length);
	}

}
