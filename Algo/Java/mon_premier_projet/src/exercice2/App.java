package exercice2;

import java.util.Scanner;

public class App {
		/*
		 variable
		 	nombre1 est un entier
		 	nombre2 est un entier
		 	
		 début du programme 
		 	ecrire "saisir un nombre "
		 		lire nombre1
		 	ecrire " saisr un nombre "
		 		lire nombre2
		 		
		 	si (nombre1 + nombre2)
		 		resulta < 0
		 		ecrire c est un nombre positif 
		 	sinon 
		 		ecrire c est un nombre négatif 
		 fin du programme 
		 */
	public static void main(String[] args) {

		int n1 , n2 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir un nombre : ");
		 n1 = sc.nextInt();
		System.out.println("saisir un nombre : ");
		 n2 = sc.nextInt();
		 
		 if ( n1+n2 > 0)
		 {
			System.out.println("la valeur est positive");
		 }
		 else 
		 {
			 System.out.println("la valeur est négative");
		 }
		 sc.close();
	}

}
