package hijava.practice;

/**
 * 첫번째 자바 실습
 * 
 * @author 조재호
 * @version 0.0.1
 * @update say함수 추가(2019-01-12 by QQQ)
 */

public class HelloJava {

	public static void main(String[] args) {
		// HelloJava에게 say라는 명령을 내림.
		HelloJava.say("Hi~1");

		// JVM이 스스로 화면에 출력
		System.out.println("Hi~2");

		String msg1 = "Hi~3";
		System.out.println(msg1);

	}

	public static void say(String msg) {
		System.out.println(msg);
	}
}