package kimpaket;

public class Antiloop extends Animal {
	
	
	
	public Antiloop(){
		hunger = 5;
		System.out.println("Oh i'm hungry!");
	}
	
	public void eat(){
		hunger = 5;
		System.out.println("namnamnam, fresh green grass.. yummie!");
	}
	
	public void dying(){
		hunger =0;
		System.out.println("Shiit I'm dead!");
	}
	
	
	
	


}
