package kimpaket;

public class Startklass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variabler för antalet djur. Om ett djur dör eller blir lik, ändra på dessa.
		//Gör en "djurnamn = null" och numberOfAnimal++ eller numberOfAnimal-- vid behov.
		int numberOfAntiloop = 0;
		int numberOfCarcass = 0;
		int numberOfHyena = 2;
		int numberOfLion = 0;
		
		
		//Exempel
		Lion simba = new Lion();
		numberOfLion++;
		simba.eat(numberOfAntiloop, numberOfHyena);
		System.out.println(simba.hunger);
		
		

//		numberOfLion--;
//		
//		Antiloop africa = new Antiloop();
//		africa.eat();
//		
//		System.out.println("Antiloop:");
//		africa.dying();
//		numberOfAntiloop--;
//		africa = null;
//		

		
				
		Antiloop africa = new Antiloop();
		numberOfAntiloop++;
		System.out.println("Antiloop:");
		africa.eat();
		
		System.out.println("Antiloop:");
		numberOfAntiloop--;
		africa.dying();
		
		Hyena h1 = new Hyena();
		numberOfHyena++;
		if(numberOfCarcass > 0){
			h1.eat();
		}
		
		//Antal djur och lik i parken
		System.out.println("Det finns " + numberOfLion + " lejon, " + numberOfHyena 
		+ " hyenor, " + numberOfAntiloop + " antiloper och " + numberOfCarcass + " ouppätna lik i savannen.");
	}

}
