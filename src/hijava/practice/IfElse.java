package hijava.practice;

public class IfElse {

	public static void main(String[] args) {
		long ctm = System.currentTimeMillis() % 10; //밀리세컨드 단위로 현재시간을 주세요
		System.out.println("ctm = " + ctm);
		
		long sct = ctm % 3;
		
		switch((int)sct) {
		case 1:
			System.out.println("One");
			break;
		
		case 2:
			System.out.println("Two");
			break;
		
		default:
			System.out.println("Zero");
		}
		//자바는 block, 즉 {}를 단위로 실행되기 때문에, 케이스사이에 괄호가 없는 switch문의 경우
		//조건에 맞는 케이스를 찾으면 해당 케이스부터 그 뒤에 존재하는 모든 케이스를 실행하기 때문에
		//각 케이스마다 break;을 걸어주어야한다.
	}

}
