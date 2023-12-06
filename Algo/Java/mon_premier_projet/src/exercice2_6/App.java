package exercice2_6;

import java.util.Scanner;

public class App {
/*
 Variables
	nombre est un entier
	i est un entier
	compteur est un entier
Debut du programme
	Ecrire "Saisir un nombre entier"
	lire N
	compteur <-- 0
	Debut boucle pour
	Pour i allant de 2 a nombre-1
		Debut Si
			Si nombre mod i = 0
			Alors
				Compteur <-- compteur+1
		Fin si
	Fin pour
	Debut si
		Si compteur = 0
		Alors
			Ecrire "Le nombre ",nombre," est premier"
		Sinon
			Ecrire "le nombre ",nombre," n'est pas premier"
	Fin si
Fin du programme
 */
	public static void main(String[] args) {
		
		int nombre=0;
		
		int compteur=0;
		
	Scanner sc = new Scanner(System.in); 
	System.out.println("saisir un nombre :");
	
	nombre = sc.nextInt();
	compteur =0;
	// début de la boucle pour 
		for (int  i = 2 ; i< nombre ; i++ )		
		{ 	
		//début de la boucle Si
			if( nombre % 1 == 0)
			{		
			compteur = compteur+1 ;
			}//fin de la boucle Si
		
		}// fin de la boucle pour
	
			// début de la boucle SINON
				if(compteur ==0)	
					{
						System.out.println("le nombre : " +nombre+" est un nombre premier");
					}
		
		else
		{
			System.out.println("le nombre : "+nombre+" n'est pas un nombre premier");
		}	// fin de la boucle SINON
	
	sc.close();	
	}
}
		