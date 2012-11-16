package kimpaket;

public class Antiloop extends Animal {
	
	public Antiloop(){
		hunger = 5;
		System.out.println("Oh i'm hungry!");
	}
	
	public void eat(){

		hunger++;

		System.out.println("namnamnam, fresh green grass.. yummie!");
	}
	
	public Object dying(){
		System.out.println("Shiit I'm dead!");
	
			return null;
		
	}
	
}
