package hijava.practice;

public class Oper {

	public static void main(String[] args) {
		int i = 0;
		
		i++; // i = i + 1;
//		i--; // i = i - 1;
		System.out.println(i++); //i값을 먼저 주고, 그 뒤에 i에 1을 더한다.
		System.out.println(++i); //i에 1을 먼저 더하고, i값을 준다.
		
		i = 2;
		i += 10;
		i *= 10;
		System.out.println(i);
		
		String k = (i > 110) ? "110보다 크다" : "110보다 작다";
		System.out.println("i는 " + k);
		
		//XOR 연산자 : 서로 달라야만 참, 그렇지 않으면 거짓
	}

}
