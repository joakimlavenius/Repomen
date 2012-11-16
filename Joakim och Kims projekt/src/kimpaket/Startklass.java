package kimpaket;

public class Startklass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variabler fï¿½r antalet djur. Om ett djur dï¿½r eller blir lik, ï¿½ndra pï¿½ dessa.
		//Gï¿½r en "djurnamn = null" och numberOfAnimal++ eller numberOfAnimal-- vid behov.
		int numberOfAntiloop = 0;
		int numberOfCarcass = 0;
		int numberOfHyena = 0;
		int numberOfLion = 0;
		
		
		//Exempel
		//Exempel
				Lion simba = new Lion();
				numberOfLion++;
				simba.eat(numberOfAntiloop, numberOfHyena);
				System.out.println(simba.hunger);
				
				simba = null;
				numberOfLion--;
		
		
				
		Antiloop africa = new Antiloop();
		numberOfAntiloop++;
		System.out.println("Antiloop:");
		africa.eat();
		
		System.out.println("Antiloop:");
		numberOfAntiloop--;
		africa.dying();
		
		//Antal djur och lik i parken
		System.out.println("Det finns " + numberOfLion + " lejon, " + numberOfHyena 
		+ " hyenor, " + numberOfAntiloop + " antiloper och " + numberOfCarcass + " ouppï¿½tna lik i savannen.");
	}

}