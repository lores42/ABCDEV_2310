package Exercice_objet1;

public class App {

	public static void main(String[] args) {

		Voiture voiture = new Voiture(1, "BMW", 220, 8);
		
		voiture.getId();
		voiture.getMarque();
		voiture.getVitesse();
		voiture.getPuissance();
		voiture.affichage();
		
		Voiture voiture1 = new Voiture(2, "ford",200, 6);
		
		voiture1.getId();
		voiture1.getMarque();
		voiture1.getVitesse();
		voiture1.getPuissance();
		voiture1.affichage();
		
		Voiture voiture2 = new Voiture(3, "Audi", 240, 8);
				
		voiture2.getId();
		voiture2.getMarque();
		voiture2.getVitesse();
		voiture2.getPuissance();
		voiture2.affichage();
	}

}
