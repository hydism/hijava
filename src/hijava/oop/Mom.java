package hijava.oop;

public class Mom {
	private String name;
	
	public Mom(String name) {
		this.name = name;
	}
	
	public Mom() {
		this("엄마");
	}
	
	public void drinkBeer() {
		System.out.println("Drinking Beer!!");
	}
	
	public String getName() {
		return this.name;
	}
	
	
	protected void eat() {
		System.out.println("EAT!!!!!!!!");
	}
	
	protected void say() {
		System.out.println("Mom said...");
	}
}
