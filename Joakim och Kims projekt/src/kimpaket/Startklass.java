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
		int numberOfHyena = 0;
		int numberOfLion = 0;
		
		
		//Exempel
		Lion simba = new Lion();
		numberOfLion++;
		simba.eat(numberOfAntiloop, numberOfHyena);
		System.out.println(simba.hunger);
		
		simba = null;
		numberOfLion--;
		
		
		//Antal djur och lik i parken
		System.out.println("Det finns " + numberOfLion + " lejon, " + numberOfHyena 
		+ " hyenor, " + numberOfAntiloop + " antiloper och " + numberOfCarcass + " ouppätna lik i savannen.");
	}

}
