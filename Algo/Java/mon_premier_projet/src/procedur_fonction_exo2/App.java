package procedur_fonction_exo2;

import java.util.Scanner;

/*
	 Variable 
	 	tableau est un entier 
	 	chiffre est un entier 
	 Début du programme
	 	ecrire (" saisire la taille du tableau ")
	 	lire tableau
	 	ecrire(" les chiffre qui seront dans le tableau ")
	 	lire chiffre 
	 	
	 */
public class App {
 
	public static int plus_grand_nombre(int[]tab)
	{
		int plus_grand=0;
		for(int i = 0; i < tab.length; i++)
		{
			if(tab[i]>plus_grand)
			{
				plus_grand=tab[i];
			}
		}
		return plus_grand;
	}
	
	public static void main(String[] args) {
		  
		int[] tab= {1, 2, 9, 4};
		int nbPlusgrand;
		nbPlusgrand=plus_grand_nombre(tab);
		
		System.out.println(nbPlusgrand);
		
		
		}

}
