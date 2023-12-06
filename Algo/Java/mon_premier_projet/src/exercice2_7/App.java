package exercice2_7;

import java.util.Scanner;

public class App {
 /*
  Variable
	kilometre est reel
	miles est un reel
	fermeture_prog est un booleen
	quit est une chaine de caractere
	saisieUtilisateur est une chaine de caractere

Debut du programme
	quit <-- "q"
	Debut tant que
	Tant que fermeture_prog est faux
	faire
		Ecrire "saisir le nombre de kilometre ou tapez q pour quitter"
		lire saisiUtilisateur
		debut si
			Si saisiUtilisateur est egale à quit
			Alors
				fermeture_prog est vrai
			Sinon
				kilometre <-- convertion en reel de saisieUtilisateur
				Debut si
					Si kilometre est < 0.01 OU kilometre > 1 000000
					Alors
						Ecrire "saisie invalide, saisissez une valeur comprise entre 0.01 et 1000000"
						Lire saisie utilisateur
					Sinon
						miles <-- kilometre/1.609
						Ecrire kilometre, " kilometre est egale à ",miles," miles"
		Fin si
	Fin tant que
Fin du programme
  */
	public static void main(String[] args) {
		//déclaration de variable 
		int km;
		int miles;
		boolean fermeture_prog;
		string quit;
		string saisi_utilisateur;
		
		// début du programme
		quit = q;
		
		Scanner sc = new Scanner(System.in);
		
		while (! fermeture_prog);
		
		System.out.println("saisir le nombre de km ou tapez q pour quitter :");
			saisi_utilisateur = sc.next();
			//début si
				if(saisi_utilisateur==quit)
				{
					fermeture_prog=true;
				}
				
				else (km == + saisi_utilisateur)
					if (km<0.01 || km>1000000)
					{
						System.out.println("saisie invalide, saisir une valeur comprise entre 0.01 et 1 000 000");
						saisi_utilisateur  string; 
					}
					else (miles==km/1.609)
					{
						 System.out.println("km est égale à : "+miles+"miles");
					}
				sc.close(); 
	}
	
	

}
