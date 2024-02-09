package Exercice_objet;

public class App {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle (6.00,2.00);
		
		rectangle1.calculer_perimettre();
		rectangle1.calculer_aire();
		rectangle1.afficher();
		
		
		Rectangle carre1 = new Rectangle (2.00,2.00);
		carre1.calculer_perimettre();
		carre1.calculer_aire();
		carre1.afficher();
	}

}
