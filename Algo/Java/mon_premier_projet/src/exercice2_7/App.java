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
		double km , miles ;
		boolean fermeture_prog;
		boolean isNumeric;
		String quit, saisie_utilisateur;
		
		
		// début du programme
		quit = "q";
		fermeture_prog = false;
		isNumeric = true; 
		
		Scanner sc = new Scanner(System.in);
		
		while (! fermeture_prog)
		{
		
			System.out.println("saisir le nombre de km ou tapez q pour quitter :");
				saisie_utilisateur = sc.next();
			//début si
					if(saisie_utilisateur==quit)
					{
						fermeture_prog=true;
					}
				
					else 
						{
							for (int i =0; i< saisie_utilisateur.length();i++)
						{
							if(!Character.isDigit(saisie_utilisateur.charAt(i)))
								{
									isNumeric = false;
								}
							else
								{
									isNumeric = true;
								}
							if (isNumeric)
								{
									km = Double.parseDouble(saisie_utilisateur);
									if ( km <0.01 || km >1000000 )
									{
										System.out.println("saisi invalide, veuillez saisir un nombre entre 0.01 et 1000000 merci.");
										saisie_utilisateur = sc.next();
									}
									else
									{
										miles = km/1.609;
										miles = Math.round(miles*100.00)/100.00;
										System.out.println(km + "egale à " + miles+"miles");
									}
							}
						}
					
					 }
				sc.close(); 
	}
	
	}

}
