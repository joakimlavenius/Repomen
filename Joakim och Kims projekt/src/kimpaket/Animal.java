package kimpaket;

public class Animal {

	//Alla djur har hunger. Ge eget djur en starthunger i djurets konstruktor
	protected int hunger;
	
	
	//Alla djur ska ha sin egen version av eat.
	public void eat(){
		hunger = 5;
	}
	

	public Object dying(){
		return null;
	}
	
	
	
	
	
}
