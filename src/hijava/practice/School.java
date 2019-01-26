package hijava.practice;

public class School {

	public static void main(String[] args) {
		Score korean = new Score();
		korean.setSubject("국어");
		korean.setScore(90);

		String k = korean.toString(); //toString사용
		System.out.println(k);
		
		System.out.println(korean);// print함수에서 객체쓰면 자연스레 toString으로 넘겨줌

		Score math = new Score("수학", 80);
		System.out.println(math);
		
		Score science = new Score("과학");
		System.out.println(science);
		
		Student std1 = new Student("2012104125", "김일수", "24", "010-1234-5678");
		System.out.println(std1);
	}
}
