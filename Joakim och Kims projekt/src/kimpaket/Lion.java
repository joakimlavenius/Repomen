package kimpaket;

public class Lion extends Animal {
	
	public Lion(){
		hunger = 10;
		System.out.println("The king of the Savannah appears!");
	}
	public void eat(int antil, int hye){
		if (antil > 0){
			System.out.println("The lion eats an innocent antilope!");
			hunger += 10;
		}
		else if (hye > 0){
			System.out.println("The lion can't find an antilope and eats a mangy hyena instead!");
			hunger += 5;
		}
		//else DÖDSFALL
		
	}
	
	
}
