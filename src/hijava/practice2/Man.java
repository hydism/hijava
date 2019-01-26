package hijava.practice2;

public class Man {
	public static final int COFFEE = 3000;
	public final static int DONUT = 2500;
	
	private String inName;
	private int inAmount;
	
	public Man(){
		this.inAmount = 10000;
	}
	
	public Man(String name){
		this();
		this.setName(name);
	}
	
	public String getName() {
		return inName;
	}

	public void setName(String name) {
		this.inName = name;
	}

	public void buyCoffee(int count) {
		this.subAmount(COFFEE, count);
	}
	
	public void buyDonut(int count) {
		this.subAmount(DONUT, count);
	}
	
	
	// 뺄 수 있는 코드들은 최대한 밖으로 빼놔라. 나중에 수정사항이 있을 때 수정하기 편하게 하기 위한 방법
	private void subAmount(int price, int count) {
		this.inAmount -= price * count;
	}
	
	@Override
	public String toString() {
		
		if(this.inAmount < 0)
			return "[이름 : " + inName + ", 잔액 : 구매불가]";
		else
			return "[이름 : " + inName + ", 잔액 : " + inAmount + "]";
	}

	public static void main(String[] args) {
		Man ex1 = new Man("Hong");
		Man ex2 = new Man("John");
		ex1.buyCoffee(1);
		ex1.buyDonut(2);
		ex2.buyCoffee(2);
		ex2.buyDonut(1);
		System.out.println("------- 사먹고 난 뒤 -------");
		System.out.println(ex1); //toString 자동호출
		System.out.println(ex2);
		System.out.println("-----------------------");
		
		Man ex3 = new Man();
		ex3.buyCoffee(5);
		ex3.buyDonut(3);
		System.out.println(ex3);
	}
}
