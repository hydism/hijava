package hijava.practice;

public class Cbvr {
		int m = 2;
		
	public static void main(String[] args) {
		int i = 1;
		System.out.println("i1=" + i);
		
		change1(i);
		System.out.println("i2=" + i);
		// Call By Value이기 때문에 값을 변경하는 메소드에 i를 넣어도 i의 값은 일시적으로 변할 뿐, change1함수가 종료되면 값은 원래대로 돌아옴
		
		Cbvr cb1 = new Cbvr();
		System.out.println("m1=" + cb1.m);
		
		change2(cb1);
		System.out.println("m2=" + cb1.m);
		
		
	}
	
	public static void change1(int x) {
		x = 100 ;
	}

	public static void change2(Cbvr cb) {
		cb.m = 100 ; // 생성된 객체가 가지고 있는 인티져변수 m에 100을 대입
	}

}
