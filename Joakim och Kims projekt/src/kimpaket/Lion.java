package kimpaket;

public class Lion extends Animal {
	
	public Lion(){
		hunger = 10;
		System.out.println("The king of the Savannah appears!");
	}
	public void eat(){
		System.out.println("The lion eats an innocent antilope!");
		hunger += 10;
	}
	
	
}
