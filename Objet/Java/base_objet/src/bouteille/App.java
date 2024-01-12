package bouteille;

public class App {

	
			
	public static void main(String[] args) {
		
		bouteille evian = new bouteille();
		bouteille badoit = new bouteille("badoit", 1.5, 0.5, false);
		
		boolean test1 = evian.ouvert();
		boolean test2 = badoit.fermer();
		
	}

}
