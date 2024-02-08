package Exercice_objet;

public class App {

	public static void main(String[] args) {

		rectangle rectangle1 = new rectangle (6.00,2.00);
		
		rectangle1.calculer_perimettre();
		rectangle1.calculer_aire();
		rectangle1.afficher();
		
		
		carre carre1 = new carre ( 6.00,6.00);
		carre1.calculer_perimettre();
		carre1.calculer_aire();
		carre1.afficher();
	}

}
