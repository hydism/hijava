package hijava.practice;

public class Casting {

	public static void main(String[] args) {
		byte b = 1;
		int i = b; //ũ�Ⱑ ���� ���� �ڷ�����ȯ�� ����
//		
//		b = i; // ũ�Ⱑ ���� ū �ڷ����� ���� �ڷ������� ��ȯ�ϴ°� �Ұ���
		long l = 1234567;
		
		System.out.println(i + l + 10);
		System.out.println(i + l + b + 10); // ��ȣ���� ���� long �ڷ������� �ڵ������� ��ȯ��.
		
		char c = 'A';
		int i2 = c ;
		System.out.println(i2);
		
		
		
	}

}
