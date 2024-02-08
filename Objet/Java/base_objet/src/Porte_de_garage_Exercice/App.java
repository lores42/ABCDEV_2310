package Porte_de_garage_Exercice;

public class App {

	public static void main(String[] args) {
		
		//String _marque, Boolean _estOuverte, Boolean _estVerouiller, int _degresOuverture, int _degresMax, int _degresMin)
		Porte_de_garage maPorte1 = new Porte_de_garage("Leroy Merlin", true, false, 25, 100, 0);
		Porte_de_garage maPorte2 = new Porte_de_garage("Bricot Depot", true, false, 0, 100, 0);
			 
			// boolean test1 = MaPorte1.ouvrir();
			// boolean test2 = MaPorte2.ouvrir();
			// boolean test3 = MaPorte1.fermer();
			// boolean test4 = MaPorte2.fermer();
			// boolean test5 = MaPorte1.verrouiller();
			// boolean test6 = MaPorte2.verrouiller();
			// boolean test7 = MaPorte1.ouvrirPartiellemnt(50);
			// boolean test9 = MaPorte2.deverrouiller();
			// boolean test8 = MaPorte2.ouvrirPartiellement(100);
			 boolean test10 = maPorte1.fermerPartiellemnt(25);
			 boolean test11 = maPorte2.fermerPartiellemnt(30);

	}

}
