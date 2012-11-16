package kimpaket;

public class Startklass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variabler f�r antalet djur. Om ett djur d�r eller blir lik, �ndra p� dessa.
		//G�r en "djurnamn = null" och numberOfAnimal++ eller numberOfAnimal-- vid behov.
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
		
		
		Hyena h1 = new Hyena();
		numberOfHyena++;
		if(numberOfCarcass > 0){
			h1.eat();
		}
		
		//Antal djur och lik i parken
		System.out.println("Det finns " + numberOfLion + " lejon, " + numberOfHyena 
		+ " hyenor, " + numberOfAntiloop + " antiloper och " + numberOfCarcass + " oupp�tna lik i savannen.");
	}

}
