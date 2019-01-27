package hijava.oop;

import java.util.ArrayList;

import hijava.practice2.Man;

public class Main {

	public static void main(String[] args) {
//		al();
//		momAndSon();
//		koreanAndAmerican();
//		drinkTest();
		eatTest();
	}

	private static void eatTest() {
		Man korean = new Korean("김첨지");
		Man american = new American("Tom");
		
		eat(korean);
		eat(american);
	}

	private static void eat(Man m) {
		if(m instanceof Korean)
			((Korean)m).eatRice();
		else
			((American)m).eatBread();
	}

	private static void drinkTest() {
		Mom mom = new Mom();
		Mom son = new Son();
		
		drink(mom);
		drink(son);
		
	}

	private static void drink(Mom m) {
		if(m instanceof Son)
			((Son) m).drinkMilk();
		else
			m.drinkBeer();
	}

	private static void koreanAndAmerican() {
		Man korean = new Korean("홍길동");
		American american = new American("John");
		
		sayHi(korean); 
		sayHi(american);
	}
	
	private static void sayHi(Man man) {
//		man.sayHello();
	}

	private static void momAndSon() {
		Mom mom = new Mom();
		Son son = new Son();
		
		mom.eat();
		son.eat();
		
		mom.say();
		son.say();
	}

	private static void al() {
		ArrayList<Man> people = new ArrayList<>(9);
		
		for (int i = 0; i < 9; i++) {
			Man m = new Man("김" + (i + 1) + "수");
			m.buyCoffee(1);
			
			people.add(m);
		}
		
		int size = people.size();
		for (int i = 0; i < size; i++) {
			System.out.println(people.get(i));
		}
	}


}
