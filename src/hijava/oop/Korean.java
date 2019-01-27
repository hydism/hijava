package hijava.oop;

import hijava.practice2.Man;

public class Korean extends Man {
	public Korean(String name) {
		
	}

	public void sayHello() {
		System.out.println("안녕하세요.");
		System.out.println("제 이름은 " + this.getName() + "입니다.");
	}

	public void eatRice() {
		System.out.println("우리나라 사람은 밥을 먹어요.");
	}
}
