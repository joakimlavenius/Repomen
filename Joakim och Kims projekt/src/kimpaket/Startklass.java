package kimpaket;

public class Startklass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variabler för antalet djur
		int numberOfAntiloop = 0;
		int numberOfCarcass = 0;
		int numberOfHyena = 0;
		int numberOfLion = 0;
		
		Lion simba = new Lion();
		numberOfLion++;
		simba.eat();
		System.out.println(simba.hunger);
		
		simba = null;
		
	}

}
