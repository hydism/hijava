package hijava.practice;

public class Loop1 {

	public static void main(String[] args) {
		int i; //declare
		i = 0; //assign(=define)
		while(i++ < 10) {
			if(i % 2 == 0)
				continue;//continue가 실행되면 뒤의 반복문 내의 코드 다 씹고 다시 조건문 시작부로 이동.
			
			if(i > 5) {
				break;
			}
			
			if(i % 2 == 1)
			System.out.println("TTTTTTTTTTTTTTTT>>" + i);
		
		}
	}

}
