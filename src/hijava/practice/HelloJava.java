package hijava.practice;

/**
 * ù��° �ڹ� �ǽ�
 * 
 * @author ����ȣ
 * @version 0.0.1
 * @update say�Լ� �߰�(2019-01-12 by QQQ)
 */

public class HelloJava {

	public static void main(String[] args) {
		// HelloJava���� say��� ����� ����.
		HelloJava.say("Hi~1");

		// JVM�� ������ ȭ�鿡 ���
		System.out.println("Hi~2");

		String msg1 = "Hi~3";
		System.out.println(msg1);

	}

	public static void say(String msg) {
		System.out.println(msg);
	}
}