package kimpaket;

public class Hyena extends Animal {
	
	public Hyena(){
		System.out.println("The Hyena is looking for a kill!");
		life = 15;
		hunger = 3;
	}
	
	
	
	public void dead(){
		if(hunger == 0){
			life = 0;
		}
	}
	
	
	
}