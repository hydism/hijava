package hijava.practice;

public class Str {

	public static void main(String[] args) {
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
