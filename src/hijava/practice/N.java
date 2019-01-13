package hijava.practice;

public class N {
	int x = 10;
	int y = 20;
	
	public void swap() {
		int temp = x;
		x = y;
		y = temp;
	}

	// 변수 2개 사용
//	public void swap2() {
//		int x1 = x;
//		int y1 = y;
//		x = y1;
//		y = x1;
//	}
	
	public static void main(String[] args) {
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		
		n.swap();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
	}
}
