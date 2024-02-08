package exercice1_compte_bancaire;

public class App {

	public static void main(String[] args) {

			compte_bancaire livretA = new compte_bancaire(500);
			
			livretA.afficher();
			livretA.deposer(1000);
			livretA.afficher();
			livretA.retirer(250);
			livretA.afficher();
	}

}
