package exercice4;

import java.util.Scanner;

public class App {

	/*
	 variable 
	 	heure est un entier
	 	minute est un eniter
	 	
	 	
	 débute du programme 
	 	écrire "saisir les heures: " 
	 		lire h 
	 	écrire "saisir les minutes "
	 		lire m
	 		minutes<--minutes+1
	 		
	 début de Si
	 	si minute =60
	 	alors
	 		minutes <-- 0
	 		heures <-- heures +1
	 fin Si
	 
	 début Si
	 	si Heures = 24
	 	alors
	 		heure <--0
	 fin si
	 
	 écrire " dans une minute il sera ",heure,"heure(s)",minutes,"minute(s)"
	 fin du programme
	
	 */
	public static void main(String[] args) {
		
		int h;
		int min;
		
	 Scanner sc = new Scanner(System.in);
	 
	 	System.out.println("saisir une heure : ");
	 	 	h  = sc.nextInt();
	 	System.out.println("saisir les minutes :");
	 		min =sc.nextInt();
	 		
	 		min = min + 1;

	 		//début de Si
	 	if (min == 60)
	 		{
	 			min = 0;
	 			h = h +1;
	 		//fin de Si
	 		//début de Si
	 	if (h == 24)
	 		{
	 			h = 0;
	 		}
	 		//fin de Si
	 	
	 		}
	 	System.out.println("dans une minute il sera : "+h+"heure "+min+"minute(s) ");
	 	//fin du programme
	 	sc.close();
	}

}
