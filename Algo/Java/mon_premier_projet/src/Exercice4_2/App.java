package Exercice4_2;

import java.util.Scanner;

public class App {

	/*
	 Variable 
	 	heure est un entier 
	 	minute est un entier 
	 	seconde est un entier 
	 	 
	 	 seconde<-- seconde+1
	 	 
	 début du programme 
	 	ecrire "saisir une heure" 
	 		lire heure 
	 	ecrire "saisir une minute"
	 		lire minute
	 	ecrire "saisir une seconde" 
	 		lire seconde
	 	//début du Si	
	 	Si ( seconde == 60 )
	 		alors 
	 			seconde = 0
	 			minute <-- minute+1
	 	//fin du Si 
	 	//début du Si
	 	Si ( minute == 60)
	 		alors
	 			minute = 0
	 			heure <-- heure+1	
	 	//fin du Si
	 	//début du Si
	 	Si (heure == 24)
	 		alors 
	 			heure = 0
	 	fin du Si
	 	
	 	écrire " dans une seconde il sera ",heure,"heure(s)",minute,"minute(s)",seconde,"seconde(s)")
	 		
	 */
	public static void main(String[] args) {
		
		int seconde, minute, heure;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir une heure : ");
			heure = sc.nextInt();
		System.out.println("saisir une minute : ");
			minute = sc.nextInt();
		System.out.println("saisir une seconde : ");
			seconde = sc.nextInt();
		
		seconde = seconde+1;
		//début de si 
		if (seconde == 60)
			{
				seconde = 0;
				minute = minute+1;
			}
		//fin de Si
		
		//début de Si
		if (minute == 60)
			{
				minute = 0;
				heure = heure+1;
			}
		//fin de Si
		
		//début de Si
		if (heure == 24)
			{
				heure=0;
			}
		
	
	System.out.println("dans une seconde il sera : "+heure+"heure(s) "+minute+"minute(s) "+seconde+"seconde(s)");
	sc.close();
	}
}
